package com.example.demo.da;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Property;

public class PropertyDA extends MySqlConnection{

	String getPropertyDataByIdstatement="select * from property where owner_id=?";
	public List<Property> ownersProperty=new ArrayList<>();
	public List<Property> getPropertyDataById(int id){
		
		
		try {
			con=DriverManager.getConnection(url,user,pass);
			ps=con.prepareStatement(getPropertyDataByIdstatement);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			while (rs.next()) {
//				(int propertyid, String type, int houseNo, String flatNo, int ownerId, String status)
				ownersProperty.add(new Property(rs.getInt(1),rs.getString(5),rs.getInt(3),rs.getString(2),rs.getInt(4),rs.getString(6)));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return ownersProperty;
	}
}
