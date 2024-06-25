package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ServiceRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int requestId;
	String serviceHead;
	String Description;
	Date requestdate;
	String status;
	int houseNo;
	String flatNo;
	Date serviceDate;
	public ServiceRequest(int requestId, String serviceHead, String description, Date requestdate, String status,
			int houseNo, String flatNo, Date serviceDate) {
		super();
		this.requestId = requestId;
		this.serviceHead = serviceHead;
		Description = description;
		this.requestdate = requestdate;
		this.status = status;
		this.houseNo = houseNo;
		this.flatNo = flatNo;
		this.serviceDate = serviceDate;
	}
	public ServiceRequest() {
		super();
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getServiceHead() {
		return serviceHead;
	}
	public void setServiceHead(String serviceHead) {
		this.serviceHead = serviceHead;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Date getRequestdate() {
		return requestdate;
	}
	public void setRequestdate(Date requestdate) {
		this.requestdate = requestdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public Date getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}
	@Override
	public String toString() {
		return "ServiceRequest [requestId=" + requestId + ", serviceHead=" + serviceHead + ", Description="
				+ Description + ", requestdate=" + requestdate + ", status=" + status + ", houseNo=" + houseNo
				+ ", flatNo=" + flatNo + ", serviceDate=" + serviceDate + ", getRequestId()=" + getRequestId()
				+ ", getServiceHead()=" + getServiceHead() + ", getDescription()=" + getDescription()
				+ ", getRequestdate()=" + getRequestdate() + ", getStatus()=" + getStatus() + ", getHouseNo()="
				+ getHouseNo() + ", getFlatNo()=" + getFlatNo() + ", getServiceDate()=" + getServiceDate()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
