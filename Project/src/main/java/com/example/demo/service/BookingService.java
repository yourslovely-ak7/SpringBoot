package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BookingEntity;
import com.example.demo.repository.BookingRepo;

@Service
public class BookingService {
	
	@Autowired
	BookingRepo br;
	
	public List<BookingEntity> saveInfo(List<BookingEntity> bs)
	{
		return (List<BookingEntity>) br.saveAll(bs);
	}
	
	public List<BookingEntity> showInfo()
	{
		return br.findAll();
	}
	
	public Optional<BookingEntity> showbyId(int id)
	{
		return br.findById(id);
	}
	
	public BookingEntity updateInfo(BookingEntity bu)
	{
		return br.saveAndFlush(bu);
	}
	
	public String updatebyId(int id, BookingEntity bu)
	{
		if(br.existsById(id))
		{
			br.saveAndFlush(bu);
			return "The records updated successfully!";
		}
		else
		{
			return "Enter a valid id!";
		}
	}
	
	public String deleteInfo(BookingEntity bd)
	{
		br.delete(bd);
		return "The records have been deleted!";
	}
	
	public String deleteById(int id)
	{
		br.deleteById(id);
		return "The records of the given id have been deleted!";
	}
	
	public String deleteParamId(int id)
	{
		br.deleteById(id);
		return "The records of the given id have been deleted!";
	}
}
