package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepo;

@Service
public class UserService {
	
	@Autowired
	UserRepo ur;
	
	public UserEntity saveInfo(UserEntity us)
	{
		return ur.save(us);
	}
	
	public List<UserEntity> showInfo()
	{
		return ur.findAll();
	}
	
	public Optional<UserEntity> showById(int id)
	{
		return ur.findById(id);
	}
	
	public UserEntity updateInfo(UserEntity uu)
	{
		return ur.saveAndFlush(uu);
	}
	
	public String updatebyId(int id, UserEntity uu)
	{
		if(ur.existsById(id))
		{
			ur.saveAndFlush(uu);
			return "The records updated successfully!";
		}
		else
		{
			return "Enter a valid id!";
		}
	}
	
	public String deleteInfo(List<UserEntity> ud)
	{
		ur.deleteAll(ud);
		return "The records have been deleted!";
	}
	
	public String deleteById(int id)
	{
		ur.deleteById(id);
		return "The records for the given id have been deleted!";
	}
	
	public String deleteParamId(int id)
	{
		ur.deleteById(id);
		return "The records for the given id have been deleted!";
	}
	
	public List<UserEntity> sort(String s)
	{
		return ur.findAll(Sort.by(Sort.DEFAULT_DIRECTION,s));
	}
	
	public List<UserEntity> page(int pno, int psize)
	{
		Page<UserEntity> page= ur.findAll(PageRequest.of(pno,psize));
		return page.getContent();
	}
	
	public List<UserEntity> pageAndSort(int pno, int psize, String s)
	{
		Page<UserEntity> page= ur.findAll(PageRequest.of(pno, psize, Sort.by(Sort.DEFAULT_DIRECTION,s)));
		return page.getContent();
	}
	
	public List<UserEntity> getbyQ(int id, String str)
	{
		return ur.getbyQ(id, str);
	}
	
	public List<UserEntity> getbyQ1(String ele)
	{
		return ur.getbyQ1(ele);
	}
	
	public String delbyQ(int id)
	{
		ur.delbyQ(id);
		return "The specified record has been deleted";
	}
	
	public String upbyQ(int newid, int oldid)
	{
		ur.upbyQ(newid, oldid);
		return "The field of the given record has been updated";
	}
	
	public UserEntity getbymail(String mail)
	{
		return ur.getbymail(mail);
	}
}