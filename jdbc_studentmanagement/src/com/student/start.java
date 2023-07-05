package com.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputFilter.Config;

public class start {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		System.out.println("hello welcome to student management application\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("PRESS 1 to add data in the database\nPRESS 2 to delete data from database\nPRESS 3 to display the data from database\nPRESS 4 to exit the prompt");
			
			int c= Integer.parseInt(br.readLine());
			
			if(c==1) {
				// add the data in db
				
				System.out.print("Enter new name: ");
				String name=br.readLine();
				
				System.out.print("Enter phone of student: ");
				String phone=  br.readLine();
				
				System.out.print("Enter City: ");
				String city= br.readLine();
				
				//creating object of student 
				
				Student st= new Student(name, phone, city);
				System.out.println(st);
				
				boolean answer=StudentDao.insertStudentToDb(st);
				
				if(answer) {
					System.out.println("inserted successfully!!");
				}
				else {
					System.out.println("something went wrong!!");
				}
			}
			
			else if(c==2) {
				//delete data from db
				
				System.out.print("Please enter user's Id: ");
				int user_id=Integer.parseInt(br.readLine());
				
				boolean answer= StudentDao.deleteStudentToDb(user_id);
				if(answer) {
					System.out.println("deletion successfully!!");
				}
				else {
					System.out.println("something went wrong!!");
				}
			}
			else if(c==3) {
				//display data from db
				StudentDao.showAllStudents();
			}
//			else if(c==4) {
//				//update elements
//				System.out.print("Enter user's id to update: ");
//				int user_id=Integer.parseInt(br.readLine());
//				
//				System.out.println("Enter one condition if no then write 0(zero): ");
//				String ifcon= br.readLine();
//				
//				if(ifcon.equals("0")) {
//:			}
			
			else if(c==5) {
				break;
			}
			
 		}
		System.out.println("\n\n\t\tthanks for using this application!");
	}

}
