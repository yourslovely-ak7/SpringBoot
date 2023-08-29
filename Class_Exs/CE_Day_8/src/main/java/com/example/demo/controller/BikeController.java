package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BikeEntity;
import com.example.demo.service.BikeService;

@RestController
public class BikeController {

	@Autowired
	BikeService bs;
	
	@PostMapping("post")
	public List<BikeEntity> create(@RequestBody List<BikeEntity> be)
	{
		return bs.post(be);
	}
	@GetMapping("get")
	public List<BikeEntity> read()
	{
		return bs.get();
	}
	@GetMapping("getbyQ/{n}")
	public List<BikeEntity> getbyQ(@PathVariable int n)
	{
		return bs.getbyQ(n);
	}
	
	@GetMapping("getbyQ1/{str}")
	public List<BikeEntity> getbyQ1(@PathVariable String str)
	{
		return bs.getbyQ1(str);
	}
}
