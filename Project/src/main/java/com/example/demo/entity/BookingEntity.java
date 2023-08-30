package com.example.demo.entity;

import java.util.Date;

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
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity ue;

	@ManyToOne
	@JoinColumn(name="hotel_id")
	private HotelEntity he;
	
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
	public BookingEntity(int bookingId, UserEntity ue, HotelEntity he, int bookedRooms, Date checkInDate,
			Date checkOutDate, float totalAmount) {
		super();
		this.bookingId = bookingId;
		this.ue = ue;
		this.he = he;
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
	public UserEntity getUe() {
		return ue;
	}
	public void setUe(UserEntity ue) {
		this.ue = ue;
	}
	public HotelEntity getHe() {
		return he;
	}
	public void setHe(HotelEntity he) {
		this.he = he;
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