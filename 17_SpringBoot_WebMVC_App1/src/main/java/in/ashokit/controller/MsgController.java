package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {

		ModelAndView mav = new ModelAndView();

		// setting response data in k-v
		mav.addObject("msg", "Introduction to the WEbMVC");

		// setting view page name
		mav.setViewName("index");

		return mav;
	}

	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {

		ModelAndView mav = new ModelAndView();

		mav.addObject("greet", "Welcome Umesh!");

		mav.setViewName("greet");

		return mav;
	}

}
