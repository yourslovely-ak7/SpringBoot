package com.example.demo.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.BookingEntity;

public interface BookingRepo extends JpaRepository<BookingEntity, Integer>
{
	@Query(value="Select *from bookings where check_in_date=:str",nativeQuery = true)
	public List<BookingEntity> getbyQ(@Param("str") String date);
	
	//@Query(value="delete from bookings where booking_id=:n", nativeQuery = true)
	//public void delbyQ()
}
