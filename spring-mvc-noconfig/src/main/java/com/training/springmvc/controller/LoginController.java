package com.training.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
class IndexController {
	
	@RequestMapping(path= "/",method=RequestMethod.GET)
	public String loginForm(ModelMap model){
		
		model.addAttribute("message", "Hello World");
		return "login";
	}	
	
	@PostMapping("/validate")
	public String validate(@RequestParam String username,@RequestParam String password, ModelMap model){
		
		if(username.equalsIgnoreCase("john")&&password.equals("password")) {
			model.addAttribute("name", username);
			return "success";
		}
		else {
			return "failed";
		}
	}	
}