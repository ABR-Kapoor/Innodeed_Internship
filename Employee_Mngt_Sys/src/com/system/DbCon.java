package com.system;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbCon {
	
	static Connection lol;
	
	public static Connection  CreateC() {
		
		try {
			
		
		//that how we load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		
		
		// creating a connection with my employee_mngt_sys named database
		
		String user="root";
		String password="radhe";
		String url= "jdbc:mysql://localhost:3306/employee_mngt_sys";
		
		
			lol=DriverManager.getConnection(url, user, password);
						
			
		} catch (Exception e) {
				System.out.println("\n\n\t\tCouldn't Connect with DataBase:(");
		}
		return lol;
		
	}

}
