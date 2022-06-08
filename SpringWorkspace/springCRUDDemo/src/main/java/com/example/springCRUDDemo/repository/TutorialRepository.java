package com.example.springCRUDDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springCRUDDemo.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long>{

	List<Tutorial> findByPublished(boolean published);
	
}
