package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CarEntity;
import com.example.demo.service.CarService;

@RestController
public class CarController {
	
	@Autowired
	CarService cs;
	
	@PostMapping("post")
	public List<CarEntity> create(@RequestBody List<CarEntity> cc)
	{
		return (List<CarEntity>) cs.post(cc);
	}
	
	@GetMapping("get")
	public List<CarEntity> read()
	{
		return cs.get();
	}
	
	@GetMapping("getbyQ/{id}/{name}")
	public List<CarEntity> getQ(@PathVariable int id,@PathVariable String name)
	{
		return cs.getbyQ(id, name);
	}
	
	@GetMapping("getbyQ1/{id}/{name}")
	public List<CarEntity> getQ1(@PathVariable int id,@PathVariable String name)
	{
		return cs.getbyQ1(id, name);
	}
	
	@GetMapping("getbyQ2/{type}")
	public List<CarEntity> getQ2(@PathVariable String type)
	{
		return cs.getbyQ2(type);
	}
	
	@GetMapping("getbyQ3/{ele}")
	public List<CarEntity> getQ3(@PathVariable String ele)
	{
		return cs.getbyQ3(ele);
	}
	
	@GetMapping("getbyQ4/{ele}")
	public List<CarEntity> getQ4(@PathVariable String ele)
	{
		return cs.getbyQ4(ele);
	}
	
	@DeleteMapping("delbyQ/{id}")
	public String delbyQ(@PathVariable int id)
	{
		return cs.delbyQ(id);
	}
	
	@PutMapping("putbyQ/{n1}/{n2}")
	public String updatebyQ(@PathVariable int n1,@PathVariable int n2)
	{
		return cs.upbyQ(n1, n2);
	}
}
