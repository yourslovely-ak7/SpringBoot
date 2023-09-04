package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HotelEntity;
import com.example.demo.repository.HotelRepo;

@Service
public class HotelService 
{
	@Autowired
	HotelRepo hr;
	
	public List<HotelEntity> saveInfo(List<HotelEntity> hs)
	{
		return (List<HotelEntity>) hr.saveAll(hs);
	}
	
	public HotelEntity save(HotelEntity hsa)
	{
		return save(hsa);
	}
	
	public List<HotelEntity> showInfo()
	{
		return hr.findAll();
	}
	
	public Optional<HotelEntity> showbyId(int id)
	{
		return hr.findById(id);
	}
	public HotelEntity updateInfo(HotelEntity hu)
	{
		return hr.saveAndFlush(hu);
	}
	
	public String updatebyId(int id, HotelEntity hu)
	{
		if(hr.existsById(id))
		{
			hr.saveAndFlush(hu);
			return "The records updated successfully!";
		}
		else
		{
			return "Enter a valid id!";
		}
	}
	
	public String deleteInfo(HotelEntity hd)
	{
		hr.delete(hd);
		return "The records have been deleted!";
	}
	
	public String deleteById(int id)
	{
		hr.deleteById(id);
		return "The records of the given id have been deleted!";
	}
	
	public String deleteParamId(int id)
	{
		hr.deleteById(id);
		return "The records of the given id have been deleted!";
	}
	

	public List<HotelEntity> sort(String s)
	{
		return hr.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	
	public List<HotelEntity> page(int pno, int psize)
	{
		Page<HotelEntity> page= hr.findAll(PageRequest.of(pno,psize));
		return page.getContent();
	}
	
	public List<HotelEntity> pageAndSort(int pno, int psize, String s)
	{
		Page<HotelEntity> page= hr.findAll(PageRequest.of(pno, psize, Sort.by(Sort.DEFAULT_DIRECTION,s)));
		return page.getContent();
	}
	
	public List<HotelEntity> getbyQ(String name,String city)
	{
		return hr.getbyQ(name,city);
	}
	
	public List<HotelEntity> getbyQ1(String city)
	{
		return hr.getbyQ1(city);
	}
}
