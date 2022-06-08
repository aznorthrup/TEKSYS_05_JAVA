package com.example.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.employeemanagement.enitity.User;

@Service
public interface UserService {

	User selectUserByUsername(String username);
	User selectUserById(long id);
	List<User> getAllUsers();
	Optional<User> checkUserPresentById(long id);
	
	void updateUser(long id, User user);
	void addUser(User user);
	void deleteUser(long id);
	void saveUser(User user);
}