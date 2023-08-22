package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.EmpModel;
import com.example.demo.repository.EmpRepo;

@Service
public class EmpService 
{
	
	@Autowired
	EmpRepo er;
	
	public EmpModel saveInfo(EmpModel ess)
	{
		return er.save(ess);
	}
	
	public List<EmpModel> showInfo()
	{
		return er.findAll();
	}
}
