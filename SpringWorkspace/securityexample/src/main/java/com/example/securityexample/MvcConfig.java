package com.example.securityexample;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{

	public void addViewControllers(ViewControllerRegistry vcr) {
		vcr.addViewController("/home").setViewName("home");
		vcr.addViewController("/").setViewName("home");
		vcr.addViewController("/hello").setViewName("hello");
		vcr.addViewController("/login").setViewName("login");
	}
	
}
