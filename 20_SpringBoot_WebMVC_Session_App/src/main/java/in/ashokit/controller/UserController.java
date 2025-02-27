package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.model.User;

@Controller
public class UserController {

	@GetMapping("/")
	public String index(Model model) {
		User userObj = new User();
		model.addAttribute("user", userObj);
		return "index";
	}

	@PostMapping("/login")
	public String login(User user, Model model) {

		String email = user.getEmail();
		String password = user.getPwd();

		if (email.equals("Umesh@gmail.com") && password.equals("abc@123")) {
			// valid Login
			return "dashboard";
		} else {
			// Invalid Login
			model.addAttribute("emsg", "*Invalid Credentials*");
		}
		return "index";
	}

	@GetMapping("/logout")
	public String logout(Model model) {
		User userObj = new User();
		model.addAttribute("user", userObj);
		return "index";
	}

}
