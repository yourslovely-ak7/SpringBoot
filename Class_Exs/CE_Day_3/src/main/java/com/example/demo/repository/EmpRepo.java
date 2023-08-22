package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.EmpModel;

public interface EmpRepo extends JpaRepository<EmpModel,Integer> 
{
	
}
