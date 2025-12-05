package com.example.karthik.karthik.com.example.karthik.karthik;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	Service service;
	
	@GetMapping("/g")
	String greet() {
		
		return "from controller";
	}
	
	@GetMapping("/studb/{id}")
	
		ResponseEntity<Data> studentDataById(@PathVariable Long id){
		try{	
			Data createStatus=service.getById(id);
			return new ResponseEntity<>(createStatus, HttpStatus.OK);
		}
		catch(RuntimeException e) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	
	}
	
	@PostMapping("/studb")
	ResponseEntity<Data> studentData(@RequestBody Data data) {
		return new ResponseEntity<>(service.service(data),HttpStatus.CREATED);
	}
}
