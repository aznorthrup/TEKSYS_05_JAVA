package com.example.thymeleaftour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ThymeleafTourApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafTourApplication.class, args);
	}

}
