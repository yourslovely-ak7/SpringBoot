package com.example.demo.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BookingEntity;
import com.example.demo.service.BookingService;

@CrossOrigin
@RestController
public class BookingController {

	@Autowired
	BookingService bs;
	
	@PostMapping("bookpost")
	public BookingEntity create(@RequestBody BookingEntity bc)
	{
		return  bs.saveInfo(bc);
	}
	
	@GetMapping("bookget")
	public List<BookingEntity> read()
	{
		return bs.showInfo();
	}
	
	@GetMapping("bookgetbyid/{id}")
	public Optional<BookingEntity> readbyId(@PathVariable int id)
	{
		return bs.showbyId(id);
	}
	
	
	@PutMapping("bookput")
	public BookingEntity update(@RequestBody BookingEntity bu)
	{
		return bs.updateInfo(bu);
	}
	
	@PutMapping("bookputbuid/{id}")
	public String updatebyId(@PathVariable int id,@RequestBody BookingEntity uu)
	{
		return bs.updatebyId(id, uu);
	}
	
	
	@DeleteMapping("bookdelete")
	public String delete(@RequestBody BookingEntity bd)
	{
		return bs.deleteInfo(bd);
	}
	
	@DeleteMapping("bookdelbyid/{id}")
	public String deleteById(@PathVariable int id)
	{
		return bs.deleteById(id);
	}
	
	@DeleteMapping("bookdelparamid")
	public String deleteParamId(@RequestParam int id)
	{
		return bs.deleteParamId(id);
	}
	
	@GetMapping("bookSort/{field}")
	public List<BookingEntity> sort(@PathVariable String field)
	{
		return bs.sort(field);
	}
	
	@GetMapping("bookPage/{pno}/{psize}")
	public List<BookingEntity> sort(@PathVariable int pno, @PathVariable int psize)
	{
		return bs.page(pno, psize);
	}
	
	@GetMapping("bookPageAndSort/{pno}/{psize}/{field}")
	public List<BookingEntity> pageAndSort(@PathVariable int pno, @PathVariable int psize , @PathVariable String field)
	{
		return bs.pageAndSort(pno, psize, field);
	}
	
	@GetMapping("bookgetbyDate/{date}")
	public List<BookingEntity> getbyDate(@PathVariable String date)
	{
		return bs.getbyDate(date);
	}
}
