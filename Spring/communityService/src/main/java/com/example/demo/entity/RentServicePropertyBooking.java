package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RentServicePropertyBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bookingId;
	int servicePropertyid;
	Date bookingStart;
	Date bookingEnd;
	String status;
	String customerName;
	String phoneNo;
	public RentServicePropertyBooking() {
		super();
	}
	public RentServicePropertyBooking(int bookingId, int servicePropertyid, Date bookingStart, Date bookingEnd,
			String status, String customerName, String phoneNo) {
		super();
		this.bookingId = bookingId;
		this.servicePropertyid = servicePropertyid;
		this.bookingStart = bookingStart;
		this.bookingEnd = bookingEnd;
		this.status = status;
		this.customerName = customerName;
		this.phoneNo = phoneNo;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getServicePropertyid() {
		return servicePropertyid;
	}
	public void setServicePropertyid(int servicePropertyid) {
		this.servicePropertyid = servicePropertyid;
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
		return "RentServicePropertyBooking [bookingId=" + bookingId + ", servicePropertyid=" + servicePropertyid
				+ ", bookingStart=" + bookingStart + ", bookingEnd=" + bookingEnd + ", status=" + status
				+ ", customerName=" + customerName + ", phoneNo=" + phoneNo + "]";
	}
	
	
}
