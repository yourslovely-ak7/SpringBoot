package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BookClass;
import com.example.demo.repository.BookRepo;

@Service
public class BookService {
	
	@Autowired
	BookRepo br;
	
	public List<BookClass> saveInfo(List<BookClass> bs)
	{
		return (List<BookClass>) br.saveAll(bs);
	}
	
	public List<BookClass> showInfo()
	{
		return br.findAll();
	}
	
	public Optional<BookClass> showbyid(int id)
	{
		return br.findById(id);
	}
	
	public BookClass updateInfo(BookClass bu)
	{
		return br.saveAndFlush(bu);
	}
	
	public String updatebyid(int id, BookClass bu)
	{
		if(br.existsById(id))
		{
			br.saveAndFlush(bu);
			return "Records updated!";
		}
		else
		{
			return "Enter a valid id to proceed";
		}
	}
	
	public String deleteInfo(BookClass bd)
	{
		 br.delete(bd);
		 return "The records have been deleted!";
	}
	
	public String deletebyid(int id)
	{
		br.deleteById(id);
		return "The records have been deleted!";
	}
	
	public String deleteparamid(int id)
	{
		br.deleteById(id);
		return "The records have been deleted!";
	}
}
