package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdvertisementPropertyBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int adPropertyBookingId;
	int adPropertyId;
	Date bookingStart;
	Date bookingEnd;
	String status;
	String customerName;
	String phoneNo;
	public AdvertisementPropertyBooking() {
		super();
	}
	public AdvertisementPropertyBooking(int adPropertyBookingId, int adPropertyId, Date bookingStart, Date bookingEnd,
			String status, String customerName, String phoneNo) {
		super();
		this.adPropertyBookingId = adPropertyBookingId;
		this.adPropertyId = adPropertyId;
		this.bookingStart = bookingStart;
		this.bookingEnd = bookingEnd;
		this.status = status;
		this.customerName = customerName;
		this.phoneNo = phoneNo;
	}
	public int getAdPropertyBookingId() {
		return adPropertyBookingId;
	}
	public void setAdPropertyBookingId(int adPropertyBookingId) {
		this.adPropertyBookingId = adPropertyBookingId;
	}
	public int getAdPropertyId() {
		return adPropertyId;
	}
	public void setAdPropertyId(int adPropertyId) {
		this.adPropertyId = adPropertyId;
	}
	public Date getBookingStart() {
		return bookingStart;
	}
	public void setBookingStart(Date bookingStart) {
		this.bookingStart = bookingStart;
	}
	public Date getBookingEnd() {
		return bookingEnd;
	}
	public void setBookingEnd(Date bookingEnd) {
		this.bookingEnd = bookingEnd;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "AdvertisementPropertyBooking [adPropertyBookingId=" + adPropertyBookingId + ", adPropertyId="
				+ adPropertyId + ", bookingStart=" + bookingStart + ", bookingEnd=" + bookingEnd + ", status=" + status
				+ ", customerName=" + customerName + ", phoneNo=" + phoneNo + "]";
	}
	
}
