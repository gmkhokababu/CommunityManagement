package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class ParkingBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int parkingId;
	String slotno;
	String carType;
	String carNo;
	Date parkingDate;
	Double fare;
	public ParkingBooking() {
		super();
	}
	public ParkingBooking(int parkingId, String slotno, String carType, String carNo, Date parkingDate, Double fare) {
		super();
		this.parkingId = parkingId;
		this.slotno = slotno;
		this.carType = carType;
		this.carNo = carNo;
		this.parkingDate = parkingDate;
		this.fare = fare;
	}
	public int getParkingId() {
		return parkingId;
	}
	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}
	public String getSlotno() {
		return slotno;
	}
	public void setSlotno(String slotno) {
		this.slotno = slotno;
	}
	public String getCarType() {
		return carType;
	}
	public void setCarType(String carType) {
		this.carType = carType;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public Date getParkingDate() {
		return parkingDate;
	}
	public void setParkingDate(Date parkingDate) {
		this.parkingDate = parkingDate;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	@Override
	public String toString() {
		return "ParkingBooking [parkingId=" + parkingId + ", slotno=" + slotno + ", carType=" + carType + ", carNo="
				+ carNo + ", parkingDate=" + parkingDate + ", fare=" + fare + "]";
	}
	
	
}
