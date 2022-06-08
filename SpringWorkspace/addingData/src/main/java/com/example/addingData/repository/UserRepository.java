package com.example.addingData.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.addingData.entities.User;

public interface UserRepository extends CrudRepository <User, Integer>{
	
}
