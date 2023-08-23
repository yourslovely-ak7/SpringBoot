package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hotels")
public class HotelEntity {

	@Id
	@GeneratedValue
	@Column(name="hotel_id")
	private int hotelId;
	@Column(name="hotel_name")
	private String hotelName;
	@Column(name="no_of_rooms_available")
	private int availableRooms;
	@Column(name="no_of_rooms_inhotel")
	private int totalRooms;
	@Column(name="hotel_address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="check_in_date")
	private Date entryDate;
	@Column(name="customer_rating")
	private float rating;
	@Column(name="chargePerRoom_perDay")
	private float pricePerRoom;
	public HotelEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HotelEntity(int hotelId, String hotelName, int availableRooms, int totalRooms, String address, String city,
			Date entryDate, float rating, float pricePerRoom) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.availableRooms = availableRooms;
		this.totalRooms = totalRooms;
		this.address = address;
		this.city = city;
		this.entryDate = entryDate;
		this.rating = rating;
		this.pricePerRoom = pricePerRoom;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getAvailableRooms() {
		return availableRooms;
	}
	public void setAvailableRooms(int availableRooms) {
		this.availableRooms = availableRooms;
	}
	public int getTotalRooms() {
		return totalRooms;
	}
	public void setTotalRooms(int totalRooms) {
		this.totalRooms = totalRooms;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public float getPricePerRoom() {
		return pricePerRoom;
	}
	public void setPricePerRoom(float pricePerRoom) {
		this.pricePerRoom = pricePerRoom;
	}
	
	
}
