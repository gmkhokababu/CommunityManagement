package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ServiceBooking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int bookingId;
	String type;
	Date date;
	int bokerId;
	String reason;
	public ServiceBooking() {
		super();
	}
	public ServiceBooking(int bookingId, String type, Date date, int bokerId, String reason) {
		super();
		this.bookingId = bookingId;
		this.type = type;
		this.date = date;
		this.bokerId = bokerId;
		this.reason = reason;
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getBokerId() {
		return bokerId;
	}
	public void setBokerId(int bokerId) {
		this.bokerId = bokerId;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "ServiceBooking [bookingId=" + bookingId + ", type=" + type + ", date=" + date + ", bokerId=" + bokerId
				+ ", reason=" + reason + ", getBookingId()=" + getBookingId() + ", getType()=" + getType()
				+ ", getDate()=" + getDate() + ", getBokerId()=" + getBokerId() + ", getReason()=" + getReason()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
