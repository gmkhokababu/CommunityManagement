package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Parking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int parkingId;
	String slotno;
	String carType;
	Double fare;
	String status;
	public Parking() {
		super();
	}
	public Parking(int parkingId, String slotno, String carType, Double fare, String status) {
		super();
		this.parkingId = parkingId;
		this.slotno = slotno;
		this.carType = carType;
		this.fare = fare;
		this.status = status;
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
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Parking [parkingId=" + parkingId + ", slotno=" + slotno + ", carType=" + carType + ", fare=" + fare
				+ ", status=" + status + "]";
	}
	
}
