package webhook.app.services;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

@Component
public class EmailService {

	private final String smtpHost;
	private final String smtpPort;
	private final String smtpUsername;
	private final String smtpPassword;
	private final String isSmtpTLS;
	private final String isSmtpAuth;
	private final Properties smtpProperties;

	public EmailService (@Value ("spring.mail.host") String smtpHost, @Value ("spring.mail.port") String smtpPort, @Value ("spring.mail.username") String smtpUsername, @Value ("spring.mail.password") String smtpPassword, @Value ("spring.mail.properties.mail.smtp.starttls.enable") String isSmtpTLS, @Value ("spring.mail.properties.mail.smtp.auth") String isSmtpAuth) {

		this.smtpHost = smtpHost;
		this.smtpPort = smtpPort;
		this.smtpUsername = smtpUsername;
		this.smtpPassword = smtpPassword;
		this.isSmtpTLS = isSmtpTLS;
		this.isSmtpAuth = isSmtpAuth;

		Properties prop = new Properties();
		prop.put("mail.smtp.auth", isSmtpAuth);
		prop.put("mail.smtp.starttls.enable", isSmtpTLS);
		prop.put("mail.smtp.host", smtpHost);
		prop.put("mail.smtp.port", smtpPort);
		prop.put("mail.smtp.ssl.trust", smtpHost);

		this.smtpProperties = prop;
	}

	public void sendSimpleMessage (String to, String subject, String text) throws MessagingException {


		Session session = Session.getInstance(this.smtpProperties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication () {
				return new PasswordAuthentication(smtpUsername, smtpPassword);
			}
		});

		Message message = new MimeMessage(session);
		message.setFrom(new InternetAddress(this.smtpUsername));
		message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		message.setSubject(subject);

		String msg = text;

		MimeBodyPart mimeBodyPart = new MimeBodyPart();
		mimeBodyPart.setContent(msg, "text/html; charset=utf-8");

		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(mimeBodyPart);

		message.setContent(multipart);

		Transport.send(message);


		//		SimpleMailMessage message = new SimpleMailMessage();
		//		message.setFrom(from);
		//		message.setTo(to);
		//		message.setSubject(subject);
		//		message.setText(text);
		//		emailSender.send(message);
	}
}
