package com.training.springmvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.training.springmvc.model.User;

@Controller
@RequestMapping("/app")
public class HomeController {

	@RequestMapping("/")
	public String displayGreeting(ModelMap model) {
		model.addAttribute("message","Hello World from Spring MVC");
		return "home";
	}
	
	@RequestMapping("/greet")
	public String displayGreeting(ModelMap model) {
		model.addAttribute("message","Hello World from Spring MVC");
		return "home";
	}
	
	@RequestMapping("/message")
	public String displayMessage(ModelMap model) {
		model.addAttribute("value","This is from different method");
		return "message";
	}
	
	@RequestMapping("/allUsers")
	public String getUsers(ModelMap model) {
		List<User> users = repository.findAll();
		String userName = null;
		model.addAttribute("value","This is from different method");
		return users;
	}
	
}
