package com.example.Backendservices;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@SpringBootApplication
@RestController
@RequestMapping("api/portfoliocheck")
public class BackendservicesApplication {
	@Autowired
	private OrderDao order;
	@GetMapping
	public List<Order> fectchOrder (){
		return order.getOrder();
	}
	public static void main(String[] args) {
		SpringApplication.run(BackendservicesApplication.class, args);
	}

}
