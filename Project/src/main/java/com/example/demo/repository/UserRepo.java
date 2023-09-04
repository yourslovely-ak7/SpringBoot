 package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.UserEntity;

import jakarta.transaction.Transactional;

public interface UserRepo extends JpaRepository<UserEntity, Integer>
{
	@Query(value="Select * from users where user_id=:n and user_name=:str",nativeQuery = true)
	public List<UserEntity> getbyQ(@Param("n") int id, @Param("str") String name);
	
	@Query(value="Select * from users where aadhar_number like %:val", nativeQuery = true)
	public List<UserEntity> getbyQ1(@Param("val") String ele);
	
	@Query(value="Select * from users where e_mail_address=:str", nativeQuery = true)
	public UserEntity getbymail(@Param("str") String mail);
	
	@Modifying
	@Transactional
	@Query(value="delete from users where user_id=?1",nativeQuery = true)
	public void delbyQ(int id);
	
	@Modifying
	@Transactional
	@Query(value="update users set user_id=?1 where user_id=?2",nativeQuery = true)
	public void upbyQ(int setid, int oldid);
}
