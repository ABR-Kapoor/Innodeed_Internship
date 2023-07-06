package com.EmployeesData;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Launch {

	public static void main(String[] args) {
		
		try {
			BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
			ManageMyFile txtFile= new ManageMyFile();
			
			System.out.print("Enter your name access: ");  
			String name = sc.readLine();
			
			System.out.print("Create your password: "); 
			String pass = sc.readLine();
			
			boolean enter = txtFile.loginData(name, pass);
			if (enter) {
				System.out.println("\n\nWELCOME!");
			} else {
				System.exit(0);
			}
			
			while (true) {
				System.out.print("\nPRESS 1 to ADD an employee\nPRESS 2 to REMOVE an Employee\nPRESS 3 to UPDATE employee's detail\nPRESS 4 to DISPLAY Employees detail\nPRESS 5 to DISPLAY by Employee's Name\n: ");
				int c = Integer.parseInt(sc.readLine());
				
				if (c == 1) {
					// Insert emp in db
					
					System.out.print("\nEnter employee's name: "); 
					String ename = sc.readLine();
					
					System.out.print("\nEnter employee's Date of Birth: "); 
					String dob = sc.readLine();
					
					System.out.print("\nEnter employee's Mentor or Manager's ID: "); 
					int mngrId = Integer.parseInt(sc.readLine());
					
					System.out.print("\nEnter employee's Email address: "); 
					String email = sc.readLine();
					
					System.out.print("\nEnter employee's Salary: "); 
					float salary = Float.parseFloat(sc.readLine());
									
					// Employee's object
					Employee ep = new Employee(ename, dob, mngrId, email, salary);
					
					boolean added = SaveEmpDetails.writeEmpValues(ep);
					if (added) {
						System.out.println("Employee added successfully!!");
					} else {
						System.out.println("Could not add employee.");
					}
				} 				
				if(c==2) {
					System.out.println("Enter Employee's Name to remove: "); String rm= sc.readLine();
					
					boolean done= SaveEmpDetails.removeEmp(rm);
					if (done) {
						System.out.println("Employee removed successfully!!");
					}
					else {
						System.out.println("Could not remove employee.");
					}		
				}
				
				if (c==3) {
					System.out.println("Enter Employee's Name to update: "); String up= sc.readLine();
					
					System.out.println("Enter What you want to update: "); String what= sc.readLine();
					
					System.out.println("Enter value to update: "); String thevalue= sc.readLine();
					
					boolean done= SaveEmpDetails.updateEmpValue(up,what,thevalue);
					if (done) {
						System.out.println("Employee updated successfully!!");
					}
					else {
						System.out.println("Could not update employee.");
					}		
				}
				
				if (c==4) {		SaveEmpDetails.readEmpfile();	}
				
				if (c==5) { 
					System.out.print("Enter Employee's Name to see its details: "); String rm= sc.readLine();
					
					SaveEmpDetails.showByEmpid(rm);
					
				}
				}
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
