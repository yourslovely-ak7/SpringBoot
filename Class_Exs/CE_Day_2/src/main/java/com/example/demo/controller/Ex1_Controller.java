package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex1_Controller {
	
	@Value("${var}")
	private String text;
	
	@GetMapping("/value")
	public String welcome()
	{
		return "Welcome to "+text;
	}
}
