package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BookClass;
import com.example.demo.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bs;
	
	@PostMapping("post")
	public List<BookClass> create(@RequestBody List<BookClass> bc)
	{
		return (List<BookClass>)bs.saveInfo(bc);
	}
	
	@GetMapping("get")
	public List<BookClass> read()
	{
		return bs.showInfo();
	}
	
	@GetMapping("getbyid/{id}")
	public Optional<BookClass> readbyid(@PathVariable int id)
	{
		return bs.showbyid(id);
	}
	
	@PutMapping("put")
	public BookClass update(@RequestBody BookClass bu)
	{
		return bs.updateInfo(bu);
	}
	
	@PutMapping("putbyid/{id}")
	public String updatebyid(@PathVariable int id,@RequestBody BookClass bu)
	{
		return bs.updatebyid(id, bu);
	}
	
	@DeleteMapping("delete")
	public String delete(@RequestBody BookClass bd)
	{
		return bs.deleteInfo(bd);
	}
	
	@DeleteMapping("delbyid/{id}")
	public String deletebyid(@PathVariable int id)
	{
		return bs.deletebyid(id);
	}
	
	@DeleteMapping("delparamid")
	public String deleteparamid(@RequestParam int id)
	{
		return bs.deleteparamid(id);
	}
}
