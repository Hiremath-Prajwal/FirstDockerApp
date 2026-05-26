package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Greet {
	
	@GetMapping("/user/greet")
	public String greeting() {
		return "Hello user Welcome!";
	}
	
}
