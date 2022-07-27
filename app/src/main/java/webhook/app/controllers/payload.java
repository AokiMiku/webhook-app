package webhook.app.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class payload
{
	@PostMapping (path = "/payload")
	public void retrievePayload() {

	}
}
