package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BookingEntity;

public interface BookingRepo extends JpaRepository<BookingEntity, Integer>
{

}
