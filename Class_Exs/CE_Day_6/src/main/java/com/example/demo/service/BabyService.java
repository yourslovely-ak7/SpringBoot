package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.BabyEntity;
import com.example.demo.repository.BabyRepo;

@Service
public class BabyService {

	@Autowired
	BabyRepo br;
	
	public List<BabyEntity> create(List<BabyEntity> bc)
	{
		return (List<BabyEntity>)br.saveAll(bc);
	}
	
	public List<BabyEntity> read()
	{
		return br.findAll();
	}
	
	public List<BabyEntity> readPage(int pno,int psize)
	{
		Page<BabyEntity> page= br.findAll(PageRequest.of(pno, psize));
		return page.getContent();
	}
	
	public List<BabyEntity> readSort(String s)
	{
		return br.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	
	public List<BabyEntity> readPageAndSort(int pno, int psize, String s)
	{
		PageRequest pr= PageRequest.of(pno, psize, Sort.by(Sort.Direction.DESC,s));
		Page<BabyEntity> page= br.findAll(pr);
		
		return page.getContent();
	}
}
