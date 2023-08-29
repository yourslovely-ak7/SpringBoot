package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.BikeEntity;

public interface BikeRepo extends JpaRepository<BikeEntity, Integer>
{
	@Query(value="Select *from bike_details where year like %:val",nativeQuery = true)
	public List<BikeEntity> getbyQ(@Param("val") int n);
	
	@Query(value="Select * from bike_details where bike_name like :val%", nativeQuery = true)
	public List<BikeEntity> getbyQ1(@Param("val") String str);
}
