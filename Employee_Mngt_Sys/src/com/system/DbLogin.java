package com.system;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DbLogin {
			
		public static boolean login( String user, String pass) {
			boolean yn= false;
			
			try {
				
				Connection con= DbCon.CreateC();
				
				String sql= "Insert into login(username, password) value(?,?)";
				
				PreparedStatement pstt = con.prepareStatement(sql);
				
				pstt.setString(1, user);
				pstt.setString(2, pass);
				
				int done= pstt.executeUpdate();
				if(done==1) {
					yn=true;
				}
				
				
			} catch (Exception e) {
				System.out.println("Something went wrong like: "+e);
			}
			
			
			return yn;
		}
	
	
}
