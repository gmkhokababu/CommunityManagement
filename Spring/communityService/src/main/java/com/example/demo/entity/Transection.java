package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Transection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int transectionId;
	int accNo;
	int payerId;
	double ammount;
	String transectionType;
	String transectionStatus;
	String purpose;
	Date date;
	public Transection() {
		super();
	}
	public Transection(int transectionId, int accNo, int payerId, double ammount, String transectionType,
			String transectionStatus, String purpose, Date date) {
		super();
		this.transectionId = transectionId;
		this.accNo = accNo;
		this.payerId = payerId;
		this.ammount = ammount;
		this.transectionType = transectionType;
		this.transectionStatus = transectionStatus;
		this.purpose = purpose;
		this.date = date;
	}
	public int getTransectionId() {
		return transectionId;
	}
	public void setTransectionId(int transectionId) {
		this.transectionId = transectionId;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public int getPayerId() {
		return payerId;
	}
	public void setPayerId(int payerId) {
		this.payerId = payerId;
	}
	public double getAmmount() {
		return ammount;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	public String getTransectionType() {
		return transectionType;
	}
	public void setTransectionType(String transectionType) {
		this.transectionType = transectionType;
	}
	public String getTransectionStatus() {
		return transectionStatus;
	}
	public void setTransectionStatus(String transectionStatus) {
		this.transectionStatus = transectionStatus;
	}
	public String getPurpose() {
		return purpose;
	}
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Transection [transectionId=" + transectionId + ", accNo=" + accNo + ", payerId=" + payerId
				+ ", ammount=" + ammount + ", transectionType=" + transectionType + ", transectionStatus="
				+ transectionStatus + ", purpose=" + purpose + ", date=" + date + "]";
	}
	
	
}
