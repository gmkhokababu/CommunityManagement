package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ServiceBill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int serviceBillId;
	int payerId;
	String purpose;
	double ammount;
	Date date;
	int requestId;
	public ServiceBill() {
		super();
	}
	public ServiceBill(int serviceBillId, int payerId, String purpose, double ammount, Date date, int requestId) {
		super();
		this.serviceBillId = serviceBillId;
		this.payerId = payerId;
		this.purpose = purpose;
		this.ammount = ammount;
		this.date = date;
		this.requestId = requestId;
	}
	public int getServiceBillId() {
		return serviceBillId;
	}
	public void setServiceBillId(int serviceBillId) {
		this.serviceBillId = serviceBillId;
	}
	public int getPayerId() {
		return payerId;
	}
	public void setPayerId(int payerId) {
		this.payerId = payerId;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	@Override
	public String toString() {
		return "ServiceBill [serviceBillId=" + serviceBillId + ", payerId=" + payerId + ", purpose=" + purpose
				+ ", ammount=" + ammount + ", date=" + date + ", requestId=" + requestId + ", getServiceBillId()="
				+ getServiceBillId() + ", getPayerId()=" + getPayerId() + ", getPurpose()=" + getPurpose()
				+ ", getAmmount()=" + getAmmount() + ", getDate()=" + getDate() + ", getRequestId()=" + getRequestId()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
