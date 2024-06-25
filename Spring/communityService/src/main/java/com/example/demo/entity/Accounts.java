package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Accounts {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int accId;
	String accountType;
	String accNo;
	String accountName;
	double debit;
	double credit;
	double balance;
	
	
	public Accounts() {
		super();
	}


	public Accounts(int accId, String accountType, String accNo, String accountName, double debit, double credit,
			double balance) {
		super();
		this.accId = accId;
		this.accountType = accountType;
		this.accNo = accNo;
		this.accountName = accountName;
		this.debit = debit;
		this.credit = credit;
		this.balance = balance;
	}


	public int getAccId() {
		return accId;
	}


	public void setAccId(int accId) {
		this.accId = accId;
	}


	public String getAccountType() {
		return accountType;
	}


	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}


	public String getAccNo() {
		return accNo;
	}


	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}


	public String getAccountName() {
		return accountName;
	}


	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	public double getDebit() {
		return debit;
	}


	public void setDebit(double debit) {
		this.debit = debit;
	}


	public double getCredit() {
		return credit;
	}


	public void setCredit(double credit) {
		this.credit = credit;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Accounts [accId=" + accId + ", accountType=" + accountType + ", accNo=" + accNo + ", accountName="
				+ accountName + ", debit=" + debit + ", credit=" + credit + ", balance=" + balance + "]";
	}



}
