package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AdvertisementProperty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int adPropertyId;
	String propertyName;
	Double rentPerMonth;
	Double serviceCharge;
	String catagory;
	public AdvertisementProperty() {
		super();
	}
	public AdvertisementProperty(int adPropertyId, String propertyName, Double rentPerMonth, Double serviceCharge,
			String catagory) {
		super();
		this.adPropertyId = adPropertyId;
		this.propertyName = propertyName;
		this.rentPerMonth = rentPerMonth;
		this.serviceCharge = serviceCharge;
		this.catagory = catagory;
	}
	public int getAdPropertyId() {
		return adPropertyId;
	}
	public void setAdPropertyId(int adPropertyId) {
		this.adPropertyId = adPropertyId;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public Double getRentPerMonth() {
		return rentPerMonth;
	}
	public void setRentPerMonth(Double rentPerMonth) {
		this.rentPerMonth = rentPerMonth;
	}
	public Double getServiceCharge() {
		return serviceCharge;
	}
	public void setServiceCharge(Double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	@Override
	public String toString() {
		return "AdvertisementProperty [adPropertyId=" + adPropertyId + ", propertyName=" + propertyName
				+ ", rentPerMonth=" + rentPerMonth + ", serviceCharge=" + serviceCharge + ", catagory=" + catagory
				+ "]";
	}
	
}
