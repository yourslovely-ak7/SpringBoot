package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BabyEntity;
import com.example.demo.service.BabyService;

@RestController
public class BabyController {
	
	@Autowired
	BabyService bs;
	
	@PostMapping("babypost")
	public List<BabyEntity> post(@RequestBody List<BabyEntity> bp)
	{
		return (List<BabyEntity>) bs.create(bp);
	}
	
	@GetMapping("babyget")
	public List<BabyEntity> get()
	{
		return bs.read();
	}
	
	@GetMapping("babyPage/{pno}/{psize}")
	public List<BabyEntity> getPage(@PathVariable int pno, @PathVariable int psize)
	{
		return bs.readPage(pno, psize);
	}
	
	@GetMapping("babySort/{s}")
	public List<BabyEntity> getSort(@PathVariable String s)
	{
		return bs.readSort(s);
	}
	
	@GetMapping("babyPageSort/{pno}/{psize}/{s}")
	public List<BabyEntity> getPageAndSort(@PathVariable int pno, @PathVariable int psize, @PathVariable String s)
	{
		return bs.readPageAndSort(pno, psize, s);
	}
}
