package com.example.addingData.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.example.addingData.entities.User;
import com.example.addingData.repository.UserRepository;

@Controller
@RequestMapping(path="/users")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	private Logger logger = LoggerFactory.getLogger(LoggerController.class);
	
	@PostMapping(path="/addUser")
	public @ResponseBody String addUser(@RequestParam String email,
										@RequestParam String name) {
		
		User newUser = new User();
		newUser.setEmail(email);
		newUser.setName(name);
		logger.info("Saved new user " + newUser.getName() + " with email " + newUser.getEmail() + "!");
		userRepository.save(newUser);
		
		return "Saved new user " + newUser.getName() + " with email " + newUser.getEmail() + "!";
	}
	
	@GetMapping(path="/allUsers")
	public @ResponseBody Iterable<User> getAllUsers(){
		logger.info("Printing all users");
		logger.debug("Failed");
		return userRepository.findAll();
	}

}