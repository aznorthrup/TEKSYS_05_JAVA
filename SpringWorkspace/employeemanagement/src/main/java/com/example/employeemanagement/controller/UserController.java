package com.example.employeemanagement.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.example.employeemanagement.enitity.User;
import com.example.employeemanagement.service.UserService;

@Controller
public class UserController {
	
	private UserService userSer;
	
	@GetMapping(path="/users")
	public String getAllUsers(Model model){
		Iterable<User> users = userSer.getAllUsers();
		model.addAttribute("users", users);
		return "allUsers.html";
	}
	
	@PostMapping(path="/add-user")
	public String addUser(Model model, @Valid User user, BindingResult bind) {
		if (bind.hasErrors()) {
			return "addUser.html";			
		}else {
			userSer.addUser(user);
			return "allUsers";
		}
	}
	
	@GetMapping(path="/{id}")
	public String editUser(@PathVariable("id") long id, Model model) {
		User user = userSer.selectUserById(id);
		model.addAttribute("user", user);
		return "user-edit.html";
	}
	
	@PostMapping(path="/{id}")
	public RedirectView updateUser(RedirectAttributes redirectAtts, @PathVariable("id")long id, @ModelAttribute User user, BindingResult bind, Model model) {
		userSer.updateUser(id, user);
		String message = (user.isWorking()?"Update":"Delete") + " <strong>"+user.getUserName()+"</strong";
		RedirectView redirectView = new RedirectView("/", true);
		redirectAtts.addFlashAttribute("userMessage", message);
		return redirectView;
	}
}