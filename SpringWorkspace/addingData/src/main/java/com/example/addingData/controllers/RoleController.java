package com.example.addingData.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.addingData.entities.UserRole;
import com.example.addingData.repository.RoleRepository;

@Controller
@RequestMapping(path="/roles")
public class RoleController {
	@Autowired
	private RoleRepository roleRep;
	
	@PostMapping(path="/addRole")
	public @ResponseBody String addUser(@RequestParam String roleName,
										@RequestParam String location) {
		UserRole newRole = new UserRole();
		
		newRole.setRoleName(roleName);
		newRole.setLocation(location);
		
		roleRep.save(newRole);
		
		return "Saved";
	}

	@GetMapping(path="/allRoles")
	public @ResponseBody Iterable<UserRole> getAllRoles(){
		return roleRep.findAll();
	}
	
}