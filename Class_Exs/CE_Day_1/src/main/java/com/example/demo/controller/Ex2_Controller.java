package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex2_Controller {
	
	private String name;
	
	@GetMapping("/name")
	
	public String getName()
	{
		name= "AthiK7";
		return "Welcome "+name+" !";
	}
}
