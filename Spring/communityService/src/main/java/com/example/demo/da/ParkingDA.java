package com.example.demo.da;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Parking;

public class ParkingDA extends MySqlConnection{

	String getAllParkingSlotByCarType="select * from parking where car_type=? and status='available'";
	public List<Parking> allParkingSlotByCarType=new ArrayList<>();
	public List<Parking> getAllParkingSlotByCarType(String carType){
			
			
			try {
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(getAllParkingSlotByCarType);
				ps.setString(1, carType);
				rs=ps.executeQuery();
				while (rs.next()) {

					allParkingSlotByCarType.add(new Parking(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5)));
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			
			return allParkingSlotByCarType;
			
	}
	
	String updateStatus="update parking set status=? where slotno=?";
	public void updateStatus(String status, String slotno) {
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(updateStatus);
			ps.setString(1, status);
			ps.setString(2, slotno);
			
			int g=ps.executeUpdate();
			System.out.println("Update Status=> "+g);
			ps.close();
		}catch(Exception e) {
			System.out.println("Update status "+e);
		}
	}
	
	String getAllParkingBookingList="select * from parking where status=?";
	public List<Parking> allParkingBookingList=new ArrayList<>();
	public List<Parking> getAllParkingBookingList(String status){
			
			
			try {
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(getAllParkingSlotByCarType);
				ps.setString(1, status);
				rs=ps.executeQuery();
				while (rs.next()) {

					allParkingBookingList.add(new Parking(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5)));
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			
			return allParkingBookingList;
			
	}
	
}
