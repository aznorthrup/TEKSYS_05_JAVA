package com.example.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.employeemanagement.enitity.User;
import com.example.employeemanagement.repository.UserRepository;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRep;
	
	@Override
	public User selectUserByUsername(String username) {
		return userRep.findByUserName(username);
	}

	@Override
	public Optional<User> checkUserPresentById(long id) {
		return userRep.findById(id);
	}

	@Override
	public void updateUser(long id, User user) {
		User userFromDB = userRep.findById(id).orElseThrow(()->new IllegalArgumentException("No such user" + id));
		userFromDB.setUserName(user.getUserName());
		userFromDB.setDescription(user.getDescription());
		userFromDB.setDate(user.getDate());
		userFromDB.setWorking(user.isWorking());
		userRep.save(userFromDB);
	}

	@Override
	public void addUser(User user) {
		userRep.save(user);
	}

	@Override
	public void deleteUser(long id) {
		Optional<User> user = userRep.findById(id);
		if(user.isPresent()) {
			userRep.deleteById(id);			
		}
	}

	@Override
	public void saveUser(User user) {
		userRep.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRep.findAll();
	}

	@Override
	public User selectUserById(long id) {
		User user = userRep.findById(id).orElseThrow(()->new IllegalArgumentException("No such user" + id));
		return user;
	}

}
