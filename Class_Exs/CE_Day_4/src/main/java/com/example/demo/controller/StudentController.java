package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping("create")
	public StudentEntity create(@RequestBody StudentEntity sc)
	{
		return ss.saveInfo(sc);
	}
	
	@GetMapping("read")
	public List<StudentEntity> read()
	{
		return ss.showInfo();
	}
	
	@PutMapping("update")
	public StudentEntity update(@RequestBody StudentEntity su)
	{
		return ss.updateInfo(su);
	}
	
	@DeleteMapping("delete")
	public String delete(@RequestBody StudentEntity sd)
	{
		return ss.deleteInfo(sd);
	}
	
	@DeleteMapping("delbyid/{id}")
	public String deletebyId(@PathVariable int id)
	{
		return ss.delById(id);
	}
	
	
	@DeleteMapping("delparamid")
	public String deleteparamId(@RequestParam int id)
	{
		return ss.delParamId(id);
	}
}
