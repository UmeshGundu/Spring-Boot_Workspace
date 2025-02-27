package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/contact")
	public String getContact() {
		return "49956596";
	}

	@GetMapping("/greet")
	public String getGreet() {
		return "Good Morning";
	}

	@GetMapping("/welcome")
	public String getWelcome() {
		return "Welcome Umesh!";
	}

}
