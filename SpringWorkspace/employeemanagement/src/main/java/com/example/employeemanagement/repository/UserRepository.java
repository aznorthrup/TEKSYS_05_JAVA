package com.example.employeemanagement.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.employeemanagement.enitity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUserName(String user);
	List<User> findAll();
}