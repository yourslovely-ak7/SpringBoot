package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.CarEntity;

public interface CarRepo extends JpaRepository<CarEntity, Integer>
{
	@Query(value="Select * from cardetails where id=:n or car_name=:str", nativeQuery = true)
	public List<CarEntity> getbyQuery(@Param("n") int id, @Param("str") String name);
	
	@Query(value="Select * from cardetails where id=:n and car_name=:str", nativeQuery = true)
	public List<CarEntity> getbyQuery1(@Param("n") int id, @Param("str") String name);
	
	@Query(value="Select * from cardetails where id in(Select id from cardetails where car_type=:str)", nativeQuery = true)
	public List<CarEntity> getbyQuery2(@Param("str") String type);
	
	@Query(value="Select * from cardetails where car_name like %:str", nativeQuery = true)
	public List<CarEntity> getbyQuery3(@Param("str") String ele);
	
	@Query(value="Select * from cardetails where car_name like :str%", nativeQuery = true)
	public List<CarEntity> getbyQuery4(@Param("str") String ele);
	
	@Modifying
	@Transactional
	@Query(value= "Delete from cardetails where id=:n", nativeQuery = true)
	public void deletebyQuery(@Param("n") int id);
	
	@Modifying
	@Transactional
	@Query(value= "update cardetails set id=?1 where id=?2", nativeQuery = true)
	public void updatebyQuery(int setid, int oldid);
}
