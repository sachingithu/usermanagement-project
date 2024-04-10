package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashokit.entity.CityEntity;
import in.ashokit.entity.CountryEntity;
import in.ashokit.entity.StateEntity;
import in.ashokit.entity.UserDetailsEntity;
import in.ashokit.service.IUserDetailsService;

@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private IUserDetailsService userService;
	
	@GetMapping("/")
	public String showHome(Model model) {
		//userService.saveUserData(null)
		model.addAttribute("user", new UserDetailsEntity());
		return "index";
	}
	@GetMapping("/register")
	public String getRegister(Model model) {
		model.addAttribute("user",new UserDetailsEntity());
		model.addAttribute("countries", userService.getCountries());
		//StateEntity sentity=userService.findByStatEntity(cid);
		//model.addAttribute("states", sentity);
	//	model.addAttribute("cities", new CityEntity());
		return "registration";
	}

}
