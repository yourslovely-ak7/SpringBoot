package com.example.demo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LoginEntity;
import com.example.demo.repository.LoginRepo;

@Service
public class LoginService {

	@Autowired
	LoginRepo lr;
	
	public LoginEntity fetchPass(String mail)
	{
		return lr.fetchPass(mail);
	}
}
