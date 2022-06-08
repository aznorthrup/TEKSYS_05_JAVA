package com.example.springCRUDDemo.myservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.springCRUDDemo.model.Tutorial;
import com.example.springCRUDDemo.repository.TutorialRepository;

@Service
public class TutorialServices {

	@Autowired
	private TutorialRepository tutorialRepo;

	public List<Tutorial> getAllTutorials() {
		List<Tutorial> tutorials = new ArrayList<Tutorial>();
		tutorialRepo.findAll().forEach(tutorials::add);
		return tutorials;
	}

	public Tutorial getTutorialById(long id) {
		Tutorial tutorial = tutorialRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("No tutorial found"));
		return tutorial;
	}

	public void deleteAllTutorials() {
		tutorialRepo.deleteAll();
	}

	public ResponseEntity<List<Tutorial>> findByPublished() {
		try {
			List<Tutorial> tutorials = tutorialRepo.findByPublished(true);

			if (tutorials.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(tutorials, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public void addTutorial(Tutorial tut) {
		tutorialRepo.save(tut);
	}
	
	public void deleteTutorial(long id) {
		tutorialRepo.deleteById(id);
	}
	
	public void deleteAll() {
		tutorialRepo.deleteAll();
	}
	
}
