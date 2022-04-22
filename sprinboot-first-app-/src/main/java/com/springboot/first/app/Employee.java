package com.springboot.first.app;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController 
public class Employee {
	
	
	//GET HTTP METHOD
	//http://localhost:8080/hello-world
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}


}
