package com.example.demo.model;

public class PAH1_Model {
	
	private String name;
	private String message;
	
	
	public PAH1_Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PAH1_Model(String name, String message) {
		super();
		this.name = name;
		this.message = message;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
