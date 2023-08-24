package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BabyEntity;

public interface BabyRepo extends JpaRepository<BabyEntity, Integer>
{

}
