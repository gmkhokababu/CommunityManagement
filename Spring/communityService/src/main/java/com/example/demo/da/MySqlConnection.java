package com.example.demo.da;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySqlConnection {
	String url="jdbc:mysql://localhost/community_service";
	String user="root";
	String pass="root";
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
}
