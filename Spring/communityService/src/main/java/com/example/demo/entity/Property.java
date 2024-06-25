package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Property {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int propertyid;
	String type;
	int houseNo;
	String flatNo;
	int ownerId;
	String status="available";
	public Property() {
		super();
	}
	public Property(int propertyid, String type, int houseNo, String flatNo, int ownerId, String status) {
		super();
		this.propertyid = propertyid;
		this.type = type;
		this.houseNo = houseNo;
		this.flatNo = flatNo;
		this.ownerId = ownerId;
		this.status = status;
	}
	public int getPropertyid() {
		return propertyid;
	}
	public void setPropertyid(int propertyid) {
		this.propertyid = propertyid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Property [propertyid=" + propertyid + ", type=" + type + ", houseNo=" + houseNo + ", flatNo=" + flatNo
				+ ", ownerId=" + ownerId + ", status=" + status + "]";
	}
	
	
	
}
