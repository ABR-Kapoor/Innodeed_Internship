package com.system;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Welcome to Employee management System :)");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	//	Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("\nPRESS 1 to add employee\nPRESS 2 to delete employee\nPRESS 3 to update employee details\nPRESS 4 to display employee details by Employee ID\nPRESS 5 to display employee details by Manager ID\nPRESS 6 to show all Employee's details\n\nPRESS 7to exit prompt");
			int c=Integer.parseInt(br.readLine());
			
			if (c==1) {
				//insert emp in db
				
				System.out.print("\nEnter employee's name: "); String name= br.readLine();
				System.out.print("\nEnter employee's Date of Birth: "); String dob=br.readLine();
				System.out.print("\nEnter employee's Mentor or Manager's ID: "); int mngrId =Integer.parseInt(br.readLine());
				System.out.print("\nEnter employee's Email address: "); String email= br.readLine();
				
				// Employee's object
				Employee ep= new Employee(name, dob, mngrId, email);
				
				boolean done=OperationEmp.AddEmp(ep);
				if (done) {
					System.out.println("\n\t\t1 row inserted... SUCCESS!!\n");
				}
				else {
					System.out.println("0 row inserted... FAILED!!");
				}
				
			}
			else if(c==2) {
				// delete emp from db
				
				System.out.println("Enter Employee's Id: ");
				int deleteId= Integer.parseInt(br.readLine());
				
				boolean done= OperationEmp.dropEmp(deleteId);
				
				if (done) {
					System.out.println("1 row Deleted... SUCESS!!");
				}
				else {
					System.out.println("0 row Deleted... FAILED!!");
				}
				
			}
			
			else if(c==3) {
				//update emp details of db
				
				System.out.print("Enter the ID of Employee to update its data: "); int emp_id= Integer.parseInt(br.readLine());
				
				System.out.print("What you want to update?\nEnter 'name' for name \nEnter 'id' for ID\nEnter 'dob' for date of birth\nEnter 'email' for email\nEnter 'mid' for Manager's Id\n :");
				String what= br.readLine();
				
				Boolean done;
				
				System.out.println("now, SET "+what+" = "); 
				String val=br.readLine();
				
				if(what.equalsIgnoreCase("name")) {
					what="empName";
				}
				else if (what.equalsIgnoreCase("id")) {
					what="empId";
				}
						
				else if(what.equalsIgnoreCase("mId")) {
					what ="managerId";
				}
				
				if (what.equals("empId")||what.equals("managerId")) {
					int value= Integer.parseInt(val);
					done= OperationEmp.updateValueInt(emp_id, what, value);
				}
				else {
					done= OperationEmp.updateValueStr(emp_id, what, val);
				}
				
				//sucess check
				if (done) {
					System.out.println("1 row affected... SUCESS!!");
				}
				else {
					System.out.println("0 row affected... FAILURE!!");
				}
								
}
			
			else if(c==4) {
				//display by emp id
				
				System.out.print("Please Enter Employee's Id: "); int emp_id= Integer.parseInt(br.readLine());
				
				boolean done= OperationEmp.showEmpByItsId(emp_id);
				
				if (done) {
					System.out.println("1 row displayed... SUCCESS!!");
				}else {
					System.out.println("0 row displayed... FAILED!!");
				}
				
				
			}
			
			else if(c==5) {
				//display by mnger id
				
				System.out.print("Please Enter Manager's Id: "); int emp_id= Integer.parseInt(br.readLine());
				
				boolean done= OperationEmp.showEmpByMngerId(emp_id);
				
				if (done) {
					System.out.println("1 row displayed... SUCCESS!!");
				}else {
					System.out.println("0 row displayed... FAILED!!");
				}
			}
			
				else if(c==6) {
					OperationEmp.showAll();
				}
				
				
			else if(c==7) {
				break;
			}
			
			else {
				System.out.println("\n\n\t\ttry again\n\n _____________________");
			}
		
		}
		
		System.out.println("Thank you!!\n see you again");

}
}
