package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Integer>
{

}
