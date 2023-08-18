package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PAH2_Model;

@RestController
public class PAH2_Controller 
{
	@GetMapping("/address")
	public ArrayList<PAH2_Model> getAddress()
	{
		ArrayList<PAH2_Model> details= new ArrayList<>();
		PAH2_Model obj=new PAH2_Model();
		
		obj.setName("AthiK7");
		obj.setDoorNo(131);
		obj.setStreetName("Mahathma Gandhi Colony");
		obj.setPincode(626130);
		obj.setArea("Aalamarathupatti Road , Sivakasi");
		obj.setDistrict("Virudhunagar");
		obj.setState("Tamil Nadu");
		obj.setCountry("India");
		
		details.add(obj);
		return details;
	}
}
