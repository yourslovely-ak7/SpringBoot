package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.EmpModel;
import com.example.demo.service.EmpService;

@RestController
public class EmpController 
{
	
	@Autowired
	EmpService es;
	
	@PostMapping("insert")
	public EmpModel create(@RequestBody EmpModel ec)
	{
		return es.saveInfo(ec);
	}
	
	@GetMapping("display")
	public List<EmpModel> display()
	{
		return es.showInfo();
	}
}
