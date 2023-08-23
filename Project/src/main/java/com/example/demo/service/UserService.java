package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo ur;
	
	public List<UserEntity> saveInfo(List<UserEntity> us)
	{
		return (List<UserEntity>)ur.saveAll(us);
	}
	
	public List<UserEntity> showInfo()
	{
		return ur.findAll();
	}
	
	public Optional<UserEntity> showById(int id)
	{
		return ur.findById(id);
	}
	
	public UserEntity updateInfo(UserEntity uu)
	{
		return ur.saveAndFlush(uu);
	}
	
	public String updatebyId(int id, UserEntity uu)
	{
		if(ur.existsById(id))
		{
			ur.saveAndFlush(uu);
			return "The records updated successfully!";
		}
		else
		{
			return "Enter a valid id!";
		}
	}
	
	public String deleteInfo(List<UserEntity> ud)
	{
		ur.deleteAll(ud);
		return "The records have been deleted!";
	}
	
	public String deleteById(int id)
	{
		ur.deleteById(id);
		return "The records for the given id have been deleted!";
	}
	
	public String deleteParamId(int id)
	{
		ur.deleteById(id);
		return "The records for the given id have been deleted!";
	}
}