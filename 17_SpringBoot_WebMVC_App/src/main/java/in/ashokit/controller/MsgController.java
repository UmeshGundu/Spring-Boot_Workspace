package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {

	@GetMapping("/")
	public String getGreet(Model model) {

		model.addAttribute("msg", "Good Morning..Umesh!");

		return "index";
	}

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {

		ModelAndView mav = new ModelAndView();

		// setting response data in k-v
		mav.addObject("MSG", "Introduction to the WEbMVC");

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

	@GetMapping("/demo")
	@ResponseBody
	public String demoMsg() {
		return "This is a demo msg";
	}

	@GetMapping("/demo2")
	@ResponseBody
	public String demoMsg2(@RequestParam("name") String name) {
		return name + ", This is a request param..";
	}

	@GetMapping("/demo3/{name}")
	@ResponseBody
	public String demoMsg3(@PathVariable("name") String name) {
		return name + ",This is path variable ";
	}

}
