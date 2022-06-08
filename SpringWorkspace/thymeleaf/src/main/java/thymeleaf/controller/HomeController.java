package thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/showFlowersList")
	public String sendFlowersToHtml(Model model) {
		String[] flowers = new String[] {"Rose", "Lily", "Tulip", "Carnation", "Hyacinth"};
		model.addAttribute("flowersVar", flowers);
		return "viewFlowers";
	}
	@GetMapping("/showCitiesList")
	public String sendCitiesToHtml(Model model) {
		String[] cities = new String[] {"Phoenix", "Mesa", "Gilbert", "Chandler", "Flagstaff"};
		model.addAttribute("citiesVar", cities);
		return "viewCities";
	}
}

// SO BASICALLY: @GetMapping calls the method under it. Name of method is irrelevant. It then makes the page "http://generic.com/whateverTheNameIs" 
// Declares various values to exist within that page, then returns an HTML file name to be displayed at that page. THYMELEAF takes those values and
//jams them into the page with th:text, th:each or th:whatever. This application summarizes the last 3 days of class in like 20 seconds. ENJOY!!!