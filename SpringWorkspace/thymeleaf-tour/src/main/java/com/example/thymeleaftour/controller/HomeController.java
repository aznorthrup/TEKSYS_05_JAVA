package com.example.thymeleaftour.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/showFlowerList")
	public String displayFlowers(Model model) {
		String[] flowers = new String[] { "Rose", "Lily", "Tulip", "Carnation", "Hyacinth" };
		model.addAttribute("flowers", flowers);
		return "viewFlowers.html";
	}

	@GetMapping("/showCitiesList")
	public String displayCities(Model model) {
		String[] cities = new String[] { "New York City", "New Jersey", "Dallas", "Chicago", "Philadelphia" };
		model.addAttribute("cities", cities);
		return "viewCities.html";
	}

	@GetMapping("/showBothLists")
	public String displayBoth(Model model) {
		String[] flowers = new String[] { "Rose", "Lily", "Tulip", "Carnation", "Hyacinth" };
		String[] cities = new String[] { "New York City", "New Jersey", "Dallas", "Chicago", "Philadelphia" };
		model.addAttribute("flowers", flowers);
		model.addAttribute("cities", cities);
		return "viewBoth.html";
	}

}
