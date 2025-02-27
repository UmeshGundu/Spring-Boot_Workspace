package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {

	@GetMapping(value = "/welcome", produces = "text/plain") // it means,this method is returning plain text to the
																// consumer.when consumer send a request to the
																// provider,provider is responding with the plain text
																// data.
																// produces will represent in which format provider
																// sending response to the client.
	public String getWelcomeMsg() {
		String msg = "Welcome to Rest API";
		return msg;
	}

	@GetMapping("/greet")
	public ResponseEntity<String> greetMsg() { // this is a class used to control what status code should we can send to
												// the
												// response. *This method is recommended*
		String msg = "Good morning";
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

}
