package com.example.dependiceioc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dependiceioc.entities.Item;
import com.example.dependiceioc.repositories.ItemRepository;

@Controller
public class ItemController {
	@Autowired
	@Qualifier("itemRepo")
	private ItemRepository itemRepo;

	@GetMapping(path="/")
	public String show() {
		return "Hello world!";
	}
	
	@PostMapping(path="/add")
	public void addItem(@PathVariable String name, @PathVariable int price) {
		Item item = new Item();
		item.setName(name);
		item.setPrice(price);
		itemRepo.save(item);
	}
	
	@PostMapping(path="/edit")
	public void editItem() {
		
	}
	
}