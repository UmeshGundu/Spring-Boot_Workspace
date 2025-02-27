package in.ashokit.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.props.AppProps;

@RestController
public class MsgRestController {

	@Autowired
	private AppProps props;

	@GetMapping("/greet")
	public String getGreetMsg() {
		Map<String, String> messages = props.getMessages();
		System.out.println(messages);
		return messages.get("greet_msg");
	}

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		Map<String, String> messages = props.getMessages();
		System.out.println(messages);
		return messages.get("welcome_msg");

	}
}
