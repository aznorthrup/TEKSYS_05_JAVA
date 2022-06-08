package validateForm.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import validateForm.entities.Person;

@Controller
public class ValidateFormController implements WebMvcConfigurer{
	
	@Override
	public void addViewControllers(ViewControllerRegistry vcr) {
		vcr.addViewController("/result").setViewName("result");
	}
	
	@GetMapping(value="/")
	public String getPersonForm(Person person) {
		return "personForm";
	}
	
	@PostMapping(value="/")
	public String checkPerson(@Valid Person person, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "personForm";
		}else {
			return "redirect:/result";
		}
	}
	
}
