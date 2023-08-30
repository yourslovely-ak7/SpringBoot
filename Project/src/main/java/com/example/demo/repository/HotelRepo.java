package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.HotelEntity;

public interface HotelRepo extends JpaRepository<HotelEntity, Integer>
{
	@Query(value="Select * from hotels where hotel_name=:str", nativeQuery = true)
	public List<HotelEntity> getbyQ(@Param("str") String name);
	
	@Query(value="Select * from hotels where hotel_id in(Select hotel_id from hotels where city=:val)",nativeQuery = true)
	public List<HotelEntity> getbyQ1(@Param("val") String city);
}
