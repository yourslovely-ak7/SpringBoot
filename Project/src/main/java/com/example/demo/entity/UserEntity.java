package com.example.demo.entity;

import jakarta.persistence.CascadeType;

//import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class UserEntity {

	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	@Column(name="user_name")
	private String name;
	@Column(name="age")
	private int age;
	@Column(name="mobile_number")
	private long mobileNo;
	@Column(name="aadhar_number")
	private long aadharNo;
	
//	@OneToMany(mappedBy = "ue")
//	List<BookingEntity> be;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="e_mail_address")
	private LoginEntity le;

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserEntity(int userId, String name, int age, long mobileNo, long aadharNo, LoginEntity le) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.aadharNo = aadharNo;
		this.le = le;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public LoginEntity getLe() {
		return le;
	}

	public void setLe(LoginEntity le) {
		this.le = le;
	}
	
	
}
