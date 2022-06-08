package com.example.addingData.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.addingData.entities.UserRole;

public interface RoleRepository extends CrudRepository<UserRole, Integer>{

}