package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LoginEntity;
import com.example.demo.service.LoginService;

@CrossOrigin
@RestController
public class LoginController {
	
	@Autowired
	LoginService ls;
	
	@GetMapping("getpass/{mail}")
	public LoginEntity fetchPass(@PathVariable String mail)
	{
		return ls.fetchPass(mail);
	}
}
