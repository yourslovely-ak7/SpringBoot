package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="rooms")
public class RoomEntity {

	@Id
	@GeneratedValue
	private int room_no;
	private int floor;
	private String available;
	public RoomEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RoomEntity(int room_no, int floor, String available) {
		super();
		this.room_no = room_no;
		this.floor = floor;
		this.available = available;
	}
	public int getRoom_no() {
		return room_no;
	}
	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getAvailable() {
		return available;
	}
	public void setAvailable(String available) {
		this.available = available;
	}
}
