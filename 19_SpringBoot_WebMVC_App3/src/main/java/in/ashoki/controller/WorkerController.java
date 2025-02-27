package in.ashoki.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import in.ashokit.service.WorkerServiceImpl;

@Controller
public class WorkerController {
	
	@Autowired
	private WorkerServiceImpl workerService;
	
	public String loadForm(Model model) {
		Model attribute = model.addAttribute("msg", model);
		return "index";
	}
	

}
