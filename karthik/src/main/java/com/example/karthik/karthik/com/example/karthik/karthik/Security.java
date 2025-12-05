package com.example.karthik.karthik.com.example.karthik.karthik;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Security{
	
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http
				.csrf
	}
	
}