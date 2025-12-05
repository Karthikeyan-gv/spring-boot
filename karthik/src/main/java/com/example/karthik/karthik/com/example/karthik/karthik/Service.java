package com.example.karthik.karthik.com.example.karthik.karthik;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	Repo repository;
	
	Data service(Data data) {
		return repository.save(data);
	}
	Data getById(Long id) {
		return repository.findById(id).orElseThrow( ()->new RuntimeException("Student not found!"));
	}

}
