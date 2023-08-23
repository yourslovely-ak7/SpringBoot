package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService us;
	
	@PostMapping("userpost")
	public List<UserEntity> create(@RequestBody List<UserEntity> uc)
	{
		return (List<UserEntity>) us.saveInfo(uc);
	}
	
	
	@GetMapping("userget")
	public List<UserEntity> read()
	{
		return us.showInfo();
	}
	
	@GetMapping("usergetbyid/{id}")
	public Optional<UserEntity> readById(@PathVariable int id)
	{
		return us.showById(id);
	}
	
	
	@PutMapping("userput")
	public UserEntity update(@RequestBody UserEntity uu)
	{
		return us.updateInfo(uu);
	}
	
	@PutMapping("userputbyid/{id}")
	public String updatebyId(@PathVariable int id,@RequestBody UserEntity uu)
	{
		return us.updatebyId(id, uu);
	}
	
	
	@DeleteMapping("userdelete")
	public String delete(@RequestBody List<UserEntity> ud)
	{
	      return us.deleteInfo(ud);
	}
	@DeleteMapping("userdelbyid/{id}")
	public String deleteById(@PathVariable int id)
	{
		return us.deleteById(id);
	}
	@DeleteMapping("userdelparamid")
	public String deleteParamId(@RequestParam int id)
	{
		return us.deleteParamId(id);
	}
}