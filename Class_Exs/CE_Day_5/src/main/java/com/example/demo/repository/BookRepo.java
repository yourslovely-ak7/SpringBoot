package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BookClass;

public interface BookRepo extends JpaRepository<BookClass, Integer>
{

}
