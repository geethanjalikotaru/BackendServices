package com.example.Backendservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("api/portfoliocheck")
public class BackendservicesApplication {
	@GetMapping
	public String fectchOrder (){
		return "Hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(BackendservicesApplication.class, args);
	}

}
