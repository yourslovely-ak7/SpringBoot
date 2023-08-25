package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CarEntity;
import com.example.demo.repository.CarRepo;

@Service
public class CarService {

	@Autowired
	CarRepo cr;
	
	public List<CarEntity> post(List<CarEntity> cp)
	{
		return (List<CarEntity>) cr.saveAll(cp);
	}
	
	public List<CarEntity> get()
	{
		return cr.findAll();
	}
	
	public List<CarEntity> getbyQ(int id, String s)
	{
		return cr.getbyQuery(id, s);
	}
	
	public List<CarEntity> getbyQ1(int id, String s)
	{
		return cr.getbyQuery1(id, s);
	}
	
	public List<CarEntity> getbyQ2(String s)
	{
		return cr.getbyQuery2(s);
	}
	
	public List<CarEntity> getbyQ3(String s)
	{
		return cr.getbyQuery3(s);
	}
	
	public List<CarEntity> getbyQ4(String s)
	{
		return cr.getbyQuery4(s);				
	}
	
	public String delbyQ(int id)
	{
		cr.deletebyQuery(id);
		return "The records are Deleted!";
	}
	
	public String upbyQ(int n1, int n2)
	{
	    cr.updatebyQuery(n1, n2);
	    
	    return "The records are Updated!";
	}
}
