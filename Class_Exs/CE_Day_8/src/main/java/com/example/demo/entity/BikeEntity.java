package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bike_details")
public class BikeEntity {
	
	@Id
	@GeneratedValue
	private int bike_id;
	private String reg_number;
	private String owner_name;
	private int year;
	private String bike_name;
	private String model_name;
	
	public BikeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BikeEntity(int bike_id, String reg_number, String owner_name, int year, String bike_name,
			String model_name) {
		super();
		this.bike_id = bike_id;
		this.reg_number = reg_number;
		this.owner_name = owner_name;
		this.year = year;
		this.bike_name = bike_name;
		this.model_name = model_name;
	}
	
	public int getBike_id() {
		return bike_id;
	}
	public void setBike_id(int bike_id) {
		this.bike_id = bike_id;
	}
	public String getReg_number() {
		return reg_number;
	}
	public void setReg_number(String reg_number) {
		this.reg_number = reg_number;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
}
