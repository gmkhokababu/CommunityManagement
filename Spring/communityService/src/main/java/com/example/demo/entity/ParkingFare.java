package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ParkingFare {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int parkingFareId;
	String carType;
	Double fare;
	public ParkingFare() {
		super();
	}
	public ParkingFare(int parkingFareId, String carType, Double fare) {
		super();
		this.parkingFareId = parkingFareId;
		this.carType = carType;
		this.fare = fare;
	}
	public int getParkingFareId() {
		return parkingFareId;
	}
	public void setParkingFareId(int parkingFareId) {
		this.parkingFareId = parkingFareId;
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
	@Override
	public String toString() {
		return "ParkingFare [parkingFareId=" + parkingFareId + ", carType=" + carType + ", fare=" + fare + "]";
	}
	
}
