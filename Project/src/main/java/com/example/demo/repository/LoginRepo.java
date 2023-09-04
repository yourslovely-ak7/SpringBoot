package com.example.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.LoginEntity;

public interface LoginRepo extends JpaRepository<LoginEntity, String> 
{
	@Query(value="Select * from login_details where mail_id like :str%", nativeQuery = true)
	public LoginEntity fetchPass(@Param("str") String mail);
}
