package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PAH1_Model;

@RestController
public class PAH1_Controller {
	
	@GetMapping("/ArrayList")
	public List<PAH1_Model> getWelcomeMessage()
	{
		return Arrays.asList(new PAH1_Model("Athi Kesavan","Vankam da Mapla!!!"),
				(new PAH1_Model("Lalisa","Hii Chellam <3")));
	}
	
}
