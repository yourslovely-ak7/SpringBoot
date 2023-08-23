package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.HotelEntity;

public interface HotelRepo extends JpaRepository<HotelEntity, Integer>
{

}
