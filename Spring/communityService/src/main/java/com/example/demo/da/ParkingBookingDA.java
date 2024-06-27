package com.example.demo.da;

import java.sql.Date;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.ParkingBooking;

public class ParkingBookingDA extends MySqlConnection{

	String getAllParkingSlotByCarType="select * from parking_booking where parking_date=? and car_no=?";
	public List<ParkingBooking> allParkingSlotByCarType=new ArrayList<>();
	public List<ParkingBooking> getAllParkingCarByDateCarNo(String carNo, Date date){
			
			
			try {
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(getAllParkingSlotByCarType);
				ps.setDate(1, date);
				ps.setString(2, carNo);
				rs=ps.executeQuery();
				while (rs.next()) {

					allParkingSlotByCarType.add(new ParkingBooking(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getDouble(6)));
				}
				ps.close();
			}catch(Exception e) {
				System.out.println(e);
			}
			
			return allParkingSlotByCarType;
			
	}
}