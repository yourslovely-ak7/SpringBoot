package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex3_Controller {

	@Value("${color}")
	private String favColor;
	
	@GetMapping("/favcolor")
	public String getMyFav()
	{
		return "My favorite color is "+favColor;
	}
}
