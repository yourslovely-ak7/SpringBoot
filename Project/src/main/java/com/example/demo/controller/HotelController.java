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

import com.example.demo.entity.HotelEntity;
import com.example.demo.service.HotelService;

@RestController
public class HotelController 
{
	@Autowired
	HotelService hs;
	
	@PostMapping("hotpost")
	public List<HotelEntity> create(@RequestBody List<HotelEntity> hc)
	{
		return (List<HotelEntity>) hs.saveInfo(hc);
	}
	
	
	@GetMapping("hotget")
	public List<HotelEntity> read()
	{
		return hs.showInfo();
	}
	
	@GetMapping("hotgetbyid/{id}")
	public Optional<HotelEntity> readbyId(@PathVariable int id)
	{
		return hs.showbyId(id);
	}
	
	
	@PutMapping("hotput")
	public HotelEntity update(@RequestBody HotelEntity hu)
	{
		return hs.updateInfo(hu);
	}
	
	@PutMapping("hotputbyid/{id}")
	public String updatebyId(@PathVariable int id,@RequestBody HotelEntity uu)
	{
		return hs.updatebyId(id, uu);
	}
	
	
	@DeleteMapping("hotdelete")
	public String delete(@RequestBody HotelEntity hd)
	{
		return hs.deleteInfo(hd);
	}
	
	@DeleteMapping("hotdelbyid/{id}")
	public String deleteById(@PathVariable int id)
	{
		return hs.deleteById(id);
	}
	@DeleteMapping("hotdelparamid")
	public String deleteParamId(@RequestParam int id)
	{
		return hs.deleteParamId(id);
	}
}
