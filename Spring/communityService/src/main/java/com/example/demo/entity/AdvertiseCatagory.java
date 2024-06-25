package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdvertiseCatagory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int catagoryId;
	String catagoryName;
	public AdvertiseCatagory() {
		super();
	}
	public AdvertiseCatagory(int catagoryId, String catagoryName) {
		super();
		this.catagoryId = catagoryId;
		this.catagoryName = catagoryName;
	}
	public int getCatagoryId() {
		return catagoryId;
	}
	public void setCatagoryId(int catagoryId) {
		this.catagoryId = catagoryId;
	}
	public String getCatagoryName() {
		return catagoryName;
	}
	public void setCatagoryName(String catagoryName) {
		this.catagoryName = catagoryName;
	}
	@Override
	public String toString() {
		return "AdvertiseCatagory [catagoryId=" + catagoryId + ", catagoryName=" + catagoryName + "]";
	}
	
}
