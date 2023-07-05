package com.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Check{

	public static int isPresent(String user, String pass) {
		int wow=0;
		
		
	    Connection con = DbCon.CreateC();
	    String sql = "SELECT EXISTS(SELECT 1 FROM login WHERE username = ? AND password = ?)";
	    String sql2 = "SELECT EXISTS(SELECT 1 FROM login WHERE password = ?)";
	    String sql3 = "SELECT EXISTS(SELECT 1 FROM login WHERE username = ?)";

	    try {
	        PreparedStatement pstt = con.prepareStatement(sql);
	        pstt.setString(1, user);
	        pstt.setString(2, pass);
	        ResultSet set = pstt.executeQuery();

	        PreparedStatement pstt2 = con.prepareStatement(sql2);
	        pstt2.setString(1, pass);
	        ResultSet set2 = pstt2.executeQuery();

	        PreparedStatement pstt3 = con.prepareStatement(sql3);
	        pstt3.setString(1, user);
	        ResultSet set3 = pstt3.executeQuery();

	        while (set.next() && set2.next() && set3.next()) {
	            boolean check = set.getBoolean(1);
	            boolean check2 = set2.getBoolean(1);
	            boolean check3 = set3.getBoolean(1);
	            
	            if(check==false) { //newbie
	        		wow=1;
	        	}
	        	if(check2==true && check3==true) { // old memeber
	        		wow=2;
	        	}
	        	if(check3==true && check2==false) { // forget passwrd
	        		wow=3;
	        	}		
	        }

	    } catch (Exception e) {
	        System.out.println("Error: " + e);
	    }
	    
	    return wow;
	}


}
