package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BikeEntity;
import com.example.demo.repository.BikeRepo;

@Service
public class BikeService {

	@Autowired
	BikeRepo br;
	
	public List<BikeEntity> post(List<BikeEntity> be)
	{
		return br.saveAll(be);
	}
	
	public List<BikeEntity> get()
	{
		return br.findAll();
	}
	
	public List<BikeEntity> getbyQ(int n)
	{
		return br.getbyQ(n);
	}
	
	public List<BikeEntity> getbyQ1(String str)
	{
		return br.getbyQ1(str);
	}
}