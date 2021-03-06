package com.springboot.first.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class StudentController {
	
	
	//http://localhost:8080/student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Vipasha", "Dewani");
		
	}

	@GetMapping("/students")
	public List<Student> getStudents(){
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Vipasha", "Dewani"));
		students.add(new Student("Mudita", "Singh"));
		students.add(new Student("Mayank", "Gupta"));
		students.add(new Student("Zoya", "Malik"));
		students.add(new Student("Atul", "Kumar"));
		return students;
		
	}
	
	//http://localhost:8080/student/vipasha
	// @PathVariable annotation
	@GetMapping("{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName")String firstName,
			@PathVariable("lastName")String lastName) {
		return new Student(firstName, lastName);
	}
	
	// build rest API to handle query parameters
	//http://localhost8080/student?firstName=Vipasha&lastName=Dewani
	@GetMapping("/student/query")
	public Student studentQueryParam(
			@RequestParam (name = "firstName")String firstName, 
			@RequestParam (name = "lastName")String lastName) {
		return new Student(firstName, lastName);
	}
	 
	
}
