package com.student;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class CP {
	
	static Connection con;
	
	public static Connection CreateC() {
		try {
			
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//create the connection
			String user="root";
			String password="radhe";
			String url= "jdbc:mysql://localhost:3306/jdbc";			
			
			con=DriverManager.getConnection(url, user, password);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
}
