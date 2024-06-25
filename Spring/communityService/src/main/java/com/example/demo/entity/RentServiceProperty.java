package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RentServiceProperty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int servicePropertyid;
	String propertyName;
	double rentPday;
	double servicecharge;
	String catagory;
	public RentServiceProperty() {
		super();
	}
	public RentServiceProperty(int servicePropertyid, String propertyName, double rentPday, double servicecharge,
			String catagory) {
		super();
		this.servicePropertyid = servicePropertyid;
		this.propertyName = propertyName;
		this.rentPday = rentPday;
		this.servicecharge = servicecharge;
		this.catagory = catagory;
	}
	public int getServicePropertyid() {
		return servicePropertyid;
	}
	public void setServicePropertyid(int servicePropertyid) {
		this.servicePropertyid = servicePropertyid;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public double getRentPday() {
		return rentPday;
	}
	public void setRentPday(double rentPday) {
		this.rentPday = rentPday;
	}
	public double getServicecharge() {
		return servicecharge;
	}
	public void setServicecharge(double servicecharge) {
		this.servicecharge = servicecharge;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	@Override
	public String toString() {
		return "RentServiceProperty [servicePropertyid=" + servicePropertyid + ", propertyName=" + propertyName
				+ ", rentPday=" + rentPday + ", servicecharge=" + servicecharge + ", catagory=" + catagory + "]";
	}
	
	
}
