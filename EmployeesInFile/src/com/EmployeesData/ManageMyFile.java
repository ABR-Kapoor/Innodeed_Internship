package com.EmployeesData;

import java.io.FileWriter;
import java.io.IOException;

public class ManageMyFile {

		public boolean loginData(String name,String pass) {
			boolean hogaya = false;
			
			try (FileWriter fWriter = new FileWriter("D:\\InternshipJavaAdvanceJDBC\\UseFileMngtInEmployee\\src\\com\\employeesData/Login.txt")) {
				fWriter.write("Username: "+name+"\n");
				fWriter.write("Password: "+pass+"\n\n__________________");
				hogaya = true;
			} catch (IOException e) {
				System.out.println("You cant login!! because: "+e);
			}
			return hogaya;
		}
		
}
