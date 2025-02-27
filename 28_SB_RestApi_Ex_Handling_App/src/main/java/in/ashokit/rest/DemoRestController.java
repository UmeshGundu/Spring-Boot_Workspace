package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/demo")
	public String getWelcomeMsg() {

		int i = 10 / 0;

		String msg = "This is Demo msg";
		return msg;
	}

}
