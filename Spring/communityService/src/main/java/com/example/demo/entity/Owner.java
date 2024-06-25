package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int ownerId;
	String ownerName;
	@Column(unique = true,nullable = false)
	String ownerPhoneNo;
	@Column(unique = true,nullable = false)
	String accNo;
	public Owner() {
		super();
	}
	public Owner(int ownerId, String ownerName, String ownerPhoneNo, String accNo) {
		super();
		this.ownerId = ownerId;
		this.ownerName = ownerName;
		this.ownerPhoneNo = ownerPhoneNo;
		this.accNo = accNo;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerPhoneNo() {
		return ownerPhoneNo;
	}
	public void setOwnerPhoneNo(String ownerPhoneNo) {
		this.ownerPhoneNo = ownerPhoneNo;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	@Override
	public String toString() {
		return "Owner [ownerId=" + ownerId + ", ownerName=" + ownerName + ", ownerPhoneNo=" + ownerPhoneNo + ", accNo="
				+ accNo + "]";
	}
	
	
	
}
