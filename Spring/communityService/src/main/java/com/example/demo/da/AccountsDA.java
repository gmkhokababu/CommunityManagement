package com.example.demo.da;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Accounts;
import com.example.demo.entity.Owner;

public class AccountsDA extends MySqlConnection{


	String getPropertyDataByIdstatement="select * from owner where owner_id=?";
	String getLastAccountInfoStatement="select * from accounts where acc_no=?";
	String accUpdatestatement="update accounts set balance=?, credit=?, debit=? where acc_no=?";
	String accByType="select * from accounts where account_type=?";

//	public List<Property> ownersProperty=new ArrayList<>();
	String acc_no;
	Accounts accountsInfo;
	Owner owner;
	double debit;
	double credit;
	double balance;
	public void updateAccounts(int id, Accounts account){
		acc_no=null;
		accountsInfo=null;
		owner=null;
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(getPropertyDataByIdstatement);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while (rs.next()) {
//				acc_no=rs.getString(1);
//				Owner(int ownerId, String ownerName, String ownerPhoneNo, String accNo)
				owner = new Owner(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				
			}
			System.out.println(owner);
			ps=con.prepareStatement(getLastAccountInfoStatement);
			ps.setString(1, owner.getAccNo());
			
			rs=ps.executeQuery();
			
			while (rs.next()) {
//				acc_no=rs.getString(1);
				//(int accId, String accountType, String accNo, String accountName, double debit, double credit,
				//double balance)
				accountsInfo = new Accounts(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getDouble(6),rs.getDouble(7));
				
			}
			acc_no=accountsInfo.getAccNo();
			System.out.println("acc_no = > "+acc_no);
			debit=accountsInfo.getDebit()+account.getDebit();
			System.out.println("debit = > "+debit);
			credit=accountsInfo.getCredit()+account.getCredit();
			System.out.println("credit = > "+credit);
			balance=credit-debit;
			System.out.println("balance = > "+balance);
			ps=con.prepareStatement(accUpdatestatement);
			ps.setDouble(1, balance);
			ps.setDouble(2, credit);
			ps.setDouble(3, debit);
			ps.setString(4, acc_no);
			int count= ps.executeUpdate();
			System.out.println("update = > "+count);
			ps.close();
			

			
		}catch(Exception e) {
			System.out.println("Accounts update"+e);
		}
		
//		return ownersProperty;
	}
	
	//==========================================================================================
	
	//get accounts by type
	List<Accounts> accounts=new ArrayList<>();
	public List<Accounts> getAllAccountsByType(String accType){
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(accByType);
			ps.setString(1, accType);
			rs=ps.executeQuery();
			
			while (rs.next()) {
				accounts.add(new Accounts(rs.getInt(1),rs.getString(4),rs.getString(2),rs.getString(3),rs.getDouble(7),rs.getDouble(6),rs.getDouble(5)));
				
			}
			ps.close();
		}catch(Exception e) {
			System.out.println("Accounts get "+e);
		}
		return accounts;
		
	}
	
	
}
