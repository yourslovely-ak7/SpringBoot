package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login_details")
public class LoginEntity {

	@Id
	private String mail_id;
	private String password;
	public LoginEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginEntity(String mail_id, String password) {
		super();
		this.mail_id = mail_id;
		this.password = password;
	}
	public String getMail_id() {
		return mail_id;
	}
	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
