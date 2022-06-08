package com.example.Thymeleafprojectdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.Thymeleafprojectdemo.entity.UserEntity;

@Controller
public class UserController {

	@GetMapping(value="/")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value="/profile", method=RequestMethod.POST)
	public ModelAndView profile(@ModelAttribute UserEntity userEntity) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("profile");
		modelAndView.addObject("UserEntity", userEntity);
		return modelAndView;
	}
	
}