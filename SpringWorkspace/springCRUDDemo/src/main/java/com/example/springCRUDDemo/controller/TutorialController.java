package com.example.springCRUDDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springCRUDDemo.model.Tutorial;
import com.example.springCRUDDemo.myservices.TutorialServices;

@RestController
@RequestMapping("/api")
public class TutorialController {

	@Autowired
	private TutorialServices tutorialServ;

	@GetMapping("/tutorials")
	public List<Tutorial> getAllTutorials(@RequestParam(required = false) String title) {
		return tutorialServ.getAllTutorials();
	}

	@GetMapping("/tutorials/{id}")
	public Tutorial getTutorialById(@PathVariable("id") long id) {
		return tutorialServ.getTutorialById(id);
	}

	@PostMapping("/tutorials")
	public void createTutorial(@RequestBody Tutorial tutorial) {
		tutorialServ.addTutorial(tutorial);
	}

	@PutMapping("/tutorials/{id}")
	public void updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
		Tutorial _tutorial = new Tutorial();
		_tutorial.setTitle(tutorial.getTitle());
		_tutorial.setDesc(tutorial.getDesc());
		_tutorial.setPublished(tutorial.isPublished());
		tutorialServ.addTutorial(_tutorial);
	}

	@DeleteMapping("/tutorials/{id}")
	public void deleteTutorial(@PathVariable("id") long id) {
		tutorialServ.deleteTutorial(id);
	}

	@DeleteMapping("/tutorials")
	public void deleteAllTutorials() {

		tutorialServ.deleteAllTutorials();
	}

	@GetMapping("/tutorials/published")
	public ResponseEntity<List<Tutorial>> findByPublished() {
		return tutorialServ.findByPublished();
	}
}