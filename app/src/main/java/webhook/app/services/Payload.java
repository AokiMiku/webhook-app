package webhook.app.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import webhook.app.data.PayloadVO;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Properties;

@RestController
public class Payload {

	public ArrayList<PayloadVO> payloads = new ArrayList<> ();

	private final String ownEmail;
	private final String ownLogin;

	public Payload (@Value ("${user.login}") String ownLogin, @Value("${user.email}") String ownEmail ) {
		this.ownEmail = ownEmail;
		this.ownLogin = ownLogin;
	}

	@PostMapping (path = "/payload")
	public void retrievePayload (@RequestBody PayloadVO payloadVO) {
		this.payloads.add (payloadVO);
		this.consumePayload (payloadVO);
	}

	public void consumePayload (PayloadVO payloadVO) {

		if (payloadVO.getPull_request () != null && payloadVO.getAction () == "opened" && payloadVO.getUser ().getLogin () != this.ownLogin) {
			sendMail (payloadVO);
		}
		else if (payloadVO.getBefore () != null && payloadVO.getAfter () != null && !Objects.equals (payloadVO.getPusher ().getEmail (), this.ownEmail)) {
			sendMail (payloadVO);
		}
		else {
			sendMail (payloadVO);
		}
	}

	public void sendMail (PayloadVO payloadVO) {

	}

	@Bean
	public JavaMailSender getJavaMailSender() {
		JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
		mailSender.setHost("smtp.strato.de");
		mailSender.setPort(465);

		mailSender.setUsername("webhooks@aps-programs.de");
		mailSender.setPassword("S3cr3t-12_");

		Properties props = mailSender.getJavaMailProperties();
		props.put("mail.transport.protocol", "smtp");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.debug", "true");

		return mailSender;
	}
}
