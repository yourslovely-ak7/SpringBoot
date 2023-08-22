package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentEntity;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo sr;
	
	public StudentEntity saveInfo(StudentEntity ss)
	{
		return sr.save(ss);
	}
	
	public List<StudentEntity> showInfo()
	{
		return sr.findAll();
	}
	
	public StudentEntity updateInfo(StudentEntity su)
	{
		return sr.saveAndFlush(su);
	}
	
	public String deleteInfo(StudentEntity sd)
	{
		sr.delete(sd);
		return "The record is deleted successfully!";
	}
	
	public String delById(int id)
	{
		sr.deleteById(id);
		return "The record is deleted successfully!";
	}
	
	public String delParamId(int id)
	{
		sr.deleteById(id);
		return "The record is deleted successfully!";
	}
}
