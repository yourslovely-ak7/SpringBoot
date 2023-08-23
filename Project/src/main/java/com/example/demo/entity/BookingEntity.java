package com.example.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Bookings")
public class BookingEntity {

	@Id
	@GeneratedValue
	@Column(name="booking_id")
	private int bookingId;
	@Column(name="user_id")
	private int userId;
	@Column(name="user_name")
	private String name;
	@Column(name="hotel_name")
	private String hotelName;
	@Column(name="hotel_address")
	private String address;
	@Column(name="no_of_rooms_booked")
	private int bookedRooms;
	@Column(name="check_in_date")
	private Date checkInDate;
	@Column(name="check_out_date")
	private Date checkOutDate;
	@Column(name="total_bill_amount")
	private float totalAmount;
	
	public BookingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookingEntity(int bookingId, int userId, String name, String hotelName, String address, int bookedRooms,
			Date checkInDate, Date checkOutDate, float totalAmount) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.name = name;
		this.hotelName = hotelName;
		this.address = address;
		this.bookedRooms = bookedRooms;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.totalAmount = totalAmount;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
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
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBookedRooms() {
		return bookedRooms;
	}
	public void setBookedRooms(int bookedRooms) {
		this.bookedRooms = bookedRooms;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
}