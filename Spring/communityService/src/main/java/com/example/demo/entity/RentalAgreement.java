package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RentalAgreement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int agreementid;
	double rentPerMonth;
	double fixedDepo;
	double serviceBill;
	double utilityBill;
	int houseNo;
	String flatno;
	public RentalAgreement() {
		super();
	}
	public RentalAgreement(int agreementid, double rentPerMonth, double fixedDepo, double serviceBill,
			double utilityBill, int houseNo, String flatno) {
		super();
		this.agreementid = agreementid;
		this.rentPerMonth = rentPerMonth;
		this.fixedDepo = fixedDepo;
		this.serviceBill = serviceBill;
		this.utilityBill = utilityBill;
		this.houseNo = houseNo;
		this.flatno = flatno;
	}
	public int getAgreementid() {
		return agreementid;
	}
	public void setAgreementid(int agreementid) {
		this.agreementid = agreementid;
	}
	public double getRentPerMonth() {
		return rentPerMonth;
	}
	public void setRentPerMonth(double rentPerMonth) {
		this.rentPerMonth = rentPerMonth;
	}
	public double getFixedDepo() {
		return fixedDepo;
	}
	public void setFixedDepo(double fixedDepo) {
		this.fixedDepo = fixedDepo;
	}
	public double getServiceBill() {
		return serviceBill;
	}
	public void setServiceBill(double serviceBill) {
		this.serviceBill = serviceBill;
	}
	public double getUtilityBill() {
		return utilityBill;
	}
	public void setUtilityBill(double utilityBill) {
		this.utilityBill = utilityBill;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getFlatno() {
		return flatno;
	}
	public void setFlatno(String flatno) {
		this.flatno = flatno;
	}
	@Override
	public String toString() {
		return "RentalAgreement [agreementid=" + agreementid + ", rentPerMonth=" + rentPerMonth + ", fixedDepo="
				+ fixedDepo + ", serviceBill=" + serviceBill + ", utilityBill=" + utilityBill + ", houseNo=" + houseNo
				+ ", flatno=" + flatno + "]";
	}
	
}
