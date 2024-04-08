package in.ashokit.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	@GetMapping("/")
	public String showHome(Model model) {
		
		return "index";
	}

}
