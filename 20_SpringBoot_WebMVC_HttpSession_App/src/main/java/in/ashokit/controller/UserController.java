package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.ashokit.model.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	@GetMapping("/")
	public String index(Model model) {
		User userObj = new User();
		model.addAttribute("user", userObj);
		return "index";
	}

	@GetMapping("/personal-details")
	@ResponseBody
	public String getPersonalDetails(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession(false);
		Object email = session.getAttribute("email");

		// get user personal data based on email

		return "Getting personal-details of " + email;
	}

	@GetMapping("/edu-details")
	@ResponseBody
	public String getEduDetails(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession(false);
		String email = (String) session.getAttribute("email");

		return "Getting edu-details of " + email;
	}

	@PostMapping("/login")
	public String login(HttpServletRequest req, User user, Model model) {
		String email = user.getEmail();
		String password = user.getPwd();

		if (email.equals("Umesh@gmail.com") && password.equals("abc@123")) {
			// valid Login
			HttpSession session = req.getSession(true);
			session.setAttribute("email", email);
			return "dashboard";
		} else {
			// Invalid Login
			model.addAttribute("emsg", "*Invalid Credentials*");
		}
		return "index";
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest req, Model model) {
		User userObj = new User();
		model.addAttribute("user", userObj);

		HttpSession session = req.getSession(false);
		session.invalidate(); // session object will be removed here

		return "index";
	}

}
