package com.example.demo.da;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.RentServiceProperty;
import com.example.demo.entity.RentServicePropertyBooking;

public class RentServicePropertyBookingDA extends MySqlConnection{
	

	String getAllPropertyByCatagory="select * from rent_service_property where catagory=?";
	public List<RentServiceProperty> allPropertybyCatagory=new ArrayList<>();
	public List<RentServiceProperty> getallPropertyByCatagory(String catagory){
			
			
			try {
				con=DriverManager.getConnection(url,user,pass);
				ps=con.prepareStatement(getAllPropertyByCatagory);
				ps.setString(1, catagory);
				rs=ps.executeQuery();
				while (rs.next()) {

					allPropertybyCatagory.add(new RentServiceProperty(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4),rs.getString(5)));
				}
			}catch(Exception e) {
				System.out.println(e);
			}
			
			return allPropertybyCatagory;
			
	}
	
}
