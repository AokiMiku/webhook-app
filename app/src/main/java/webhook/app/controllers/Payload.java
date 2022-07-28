package webhook.app.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import webhook.app.data.PayloadVO;

@RestController
public class Payload {
	@PostMapping (path = "/payload")
	public void retrievePayload (@RequestBody PayloadVO payloadVO) {
		System.out.println (payloadVO.getAfter ());
	}
}
