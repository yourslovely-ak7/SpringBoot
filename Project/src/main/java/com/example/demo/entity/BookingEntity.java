package com.example.demo.entity;



//import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Bookings")
public class BookingEntity {

	@Id
	@GeneratedValue
	@Column(name="booking_id")
	private int bookingId;
	
//	@ManyToOne
//	@JoinColumn(name="user_id")
//	private UserEntity ue;
//
//	@ManyToOne
//	@JoinColumn(name="hotel_id")
//	private HotelEntity he;
	
	private int user_id;
	private int hotel_id;
	
	@Column(name="no_of_rooms_booked")
	private int bookedRooms;
	@Column(name="check_in_date")
	private String checkInDate; 
	@Column(name="check_out_date")
	private String checkOutDate;
	@Column(name="total_bill_amount")
	private float totalAmount;
	
	public BookingEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookingEntity(int bookingId, int user_id, int hotel_id, int bookedRooms, String checkInDate,
			String checkOutDate, float totalAmount) {
		super();
		this.bookingId = bookingId;
		this.user_id = user_id;
		this.hotel_id = hotel_id;
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

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getHotel_id() {
		return hotel_id;
	}

	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}

	public int getBookedRooms() {
		return bookedRooms;
	}

	public void setBookedRooms(int bookedRooms) {
		this.bookedRooms = bookedRooms;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	
}