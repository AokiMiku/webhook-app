package webhook.app.services;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import webhook.app.data.PayloadVO;

import java.util.ArrayList;

@RestController
public class Payload {

	public ArrayList<PayloadVO> payloads = new ArrayList<> ();

	@PostMapping (path = "/payload")
	public void retrievePayload (@RequestBody PayloadVO payloadVO) {
		this.payloads.add (payloadVO);
	}
}
