package com.example.demo.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RentalRegistration {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int regid;
int houseNo;
String flatNo;
String tenantName;
String phoneNo;
int familyMember;
String occupation;
Date rentDate;
Date terminateDate;
String status;
public RentalRegistration() {
	super();
}
public RentalRegistration(int regid, int houseNo, String flatNo, String tenantName, String phoneNo, int familyMember,
		String occupation, Date rentDate, Date terminateDate, String status) {
	super();
	this.regid = regid;
	this.houseNo = houseNo;
	this.flatNo = flatNo;
	this.tenantName = tenantName;
	this.phoneNo = phoneNo;
	this.familyMember = familyMember;
	this.occupation = occupation;
	this.rentDate = rentDate;
	this.terminateDate = terminateDate;
	this.status = status;
}
public int getRegid() {
	return regid;
}
public void setRegid(int regid) {
	this.regid = regid;
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
public String getTenantName() {
	return tenantName;
}
public void setTenantName(String tenantName) {
	this.tenantName = tenantName;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public int getFamilyMember() {
	return familyMember;
}
public void setFamilyMember(int familyMember) {
	this.familyMember = familyMember;
}
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}
public Date getRentDate() {
	return rentDate;
}
public void setRentDate(Date rentDate) {
	this.rentDate = rentDate;
}
public Date getTerminateDate() {
	return terminateDate;
}
public void setTerminateDate(Date terminateDate) {
	this.terminateDate = terminateDate;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "RentalRegistration [regid=" + regid + ", houseNo=" + houseNo + ", flatNo=" + flatNo + ", tenantName="
			+ tenantName + ", phoneNo=" + phoneNo + ", familyMember=" + familyMember + ", occupation=" + occupation
			+ ", rentDate=" + rentDate + ", terminateDate=" + terminateDate + ", status=" + status + "]";
}

}
