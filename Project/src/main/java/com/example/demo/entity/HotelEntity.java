package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;

//import java.util.Date;
//import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="hotels")
public class HotelEntity {

	@Id
	@Column(name="hotel_id")
	private int hotelId;
	@Column(name="hotel_name")
	private String hotelName;
	@Column(name="no_of_rooms_in_hotel")
	private int totalRooms;
	@Column(name="hotel_address")
	private String address;
	@Column(name="city")
	private String city;
	@Column(name="customer_rating")
	private float rating;
	@Column(name="chargePerRoom_perDay")
	private float pricePerRoom;
	@Column(name="links")
	private String links;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="hotel_id")
	private List<RoomEntity> re;

	public HotelEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HotelEntity(int hotelId, String hotelName, int totalRooms, String address, String city, float rating,
			float pricePerRoom, String links, List<RoomEntity> re) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.totalRooms = totalRooms;
		this.address = address;
		this.city = city;
		this.rating = rating;
		this.pricePerRoom = pricePerRoom;
		this.links = links;
		this.re = re;
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

	public String getLinks() {
		return links;
	}

	public void setLinks(String links) {
		this.links = links;
	}

	public List<RoomEntity> getRe() {
		return re;
	}

	public void setRe(List<RoomEntity> re) {
		this.re = re;
	}

}