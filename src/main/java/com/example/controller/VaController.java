package com.example.controller;

import javax.validation.Valid;

//import javax.validation.Valid;
//import javax.validation.Validator

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.User;

@Controller
public class VaController {

	@ModelAttribute("User")
	public User setUser() {
		return new User();
	}
	
	@GetMapping("/")
	public String login() {
		return "login";
	}
	
//	@PostMapping("/Postlogin")
//	public String logincheck(@Valid @ModelAttribute("User") User user, BindingResult bindingResult,Model model) {
//		System.out.println("haserrs "+bindingResult.hasErrors());
//		if(bindingResult.hasErrors()) {
//			return "login";
//		}
//		
//		System.out.println("--------------- id:" + user.getUserId());
//		return "welcome";
//	}
	@PostMapping("/Postlogin")
	public String logincheck(@Valid @ModelAttribute("User") User user, Model model) {
//		System.out.println("haserrs "+bindingResult.hasErrors());
//		if(bindingResult.hasErrors()) {
//			return "login";
//		}
		
		System.out.println("--------------- id:" + user.getUserId());
		return "welcome";
	}
}
