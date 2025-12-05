package com.example.karthik.karthik.com.example.karthik.karthik;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Data {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    	Long id;
	String name;
	String address;
	String phone;
	
	public Data() {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}


//{
//    "id": 1,
//    "name": "Liam Smith",
//    "address": "789 Oak Ave, Springfield, IL 62704",
//    "phone": "555-123-4567"
//  },
//  {
//    "id": 2,
//    "name": "Olivia Johnson",
//    "address": "123 Pine St, Metropolis, NY 10001",
//    "phone": "555-987-6543"
//  },
//  {
//    "id": 3,
//    "name": "Noah Williams",
//    "address": "456 Birch Ln, Gotham, CA 90210",
//    "phone": "555-555-1212"
//  },
//  {
//    "id": 4,
//    "name": "Emma Brown",
//    "address": "901 Cedar Dr, Star City, TX 75001",
//    "phone": "555-222-3344"
//  },
//  {
//    "id": 5,
//    "name": "Oliver Jones",
//    "address": "234 Maple Rd, Central City, FL 33101",
//    "phone": "555-777-8899"
//  }
