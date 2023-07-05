package com.employeesData;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		Scanner sc= new Scanner(System.in);
		
			while(true) {
				
			System.out.println("Enter Username: "); String user= sc.nextLine();
			System.out.println("Enter Password: "); String pass= sc.nextLine();
			
			System.out.println("Write what you want to write: ");
			String txt = sc.nextLine();

			boolean likhdiya = milf.writeFile(fName, txt);
			if (likhdiya) {
				System.out.println("\n\tContent written to the file successfully!!\n");
			} else {
				System.out.println("Couldn't write to the file.");
			}
			
			if (yn==1) {
				System.out.println("\n\tNew User, Added!");
				boolean ok= DbLogin.login(user, pass);
			    
						 if(ok) {
							 System.out.println("\n\tWelcome to Employee management System :)");
						    	break;
						    }
						    else {
								System.out.println("Sorry! Try again\n"); 
							}
					     } 
			
			else if(yn==2) {
				System.out.println("\n\tWelcome back!"); break; 
			}
			else if(yn==3) { 
				System.out.println("\n\tYou Entered Wrong Password :(\n");
			}
		}
		    
	   

		while(true) {
			System.out.println("\nPRESS 1 to ADD employee\nPRESS 2 to REMOVE employee\nPRESS 3 to UPDATE employee details\nPRESS 4 to DISPLAY employee details by _Employee ID_\nPRESS 5 to DISPLAY employee details by _Manager ID_\nPRESS 6 to DISPLAY _All_ Employees details\nPRESS 7 to INCREAMENT Employee's Salary\nPRESS 8 to EXIT prompt");
			int c=Integer.parseInt(br.readLine());
			
			if (c==1) {
				//insert emp in db
				
				System.out.print("\nEnter employee's name: "); String name= br.readLine();
				System.out.print("\nEnter employee's Date of Birth: "); String dob=br.readLine();
				System.out.print("\nEnter employee's Mentor or Manager's ID: "); int mngrId =Integer.parseInt(br.readLine());
				System.out.print("\nEnter employee's Email address: "); String email= br.readLine();
				System.out.print("\nEnter employee's Salary: "); float salary= Float.parseFloat(br.readLine());
								
				// Employee's object
				Employee ep= new Employee(name, dob, mngrId, email,salary);
				
				// creating arraylist to store employee
				SaveEmpList.saveData(ep);
				
				
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
				
				System.out.print("What you want to update?\nEnter 'name' for name \nEnter 'id' for ID\nEnter 'dob' for date of birth\nEnter 'email' for email\nEnter 'mid' for Manager's Id\nEnter 'salary' for salary\n");
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
				
				if (what.equals("empId")||what.equals("managerId") || what.equals("salary")) {
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
					//select * from emp;
					OperationEmp.showAll();
//					SaveEmpList.fetchData();
//					SaveEmpList.fetchData();
				}
			
				else if (c==7) {
					// Increament salary in percent
					
					LetsUseLambda raise= (int id, float percentage) ->  {
									boolean b=false;
									try {
									
									Connection con = DbCon.CreateC();
									String sql= "update emp set salary = salary+(salary*"+percentage+")/100 where empId="+id+"\n";
									Statement stt= con.createStatement();
									
									int done = stt.executeUpdate(sql);
									if (done==1) {
										b=true;
									}
									
									} catch (Exception e) {
										System.out.println("\n\tSome problems Occur see this: "+e);
									}
									
									return b;
					};
					
					System.out.print("Enter the Employee Id: "); 
					int id= Integer.parseInt(br.readLine());
					
					System.out.print("Percentage to increament: "); 
					float percentage= Integer.parseInt(br.readLine());
					
					boolean done= raise.IncreamentSalary(id,percentage);
					if (done) {
						System.out.println("1 row affected... SUCESS!!");
					} else {
						System.out.println("0 row affected... FAILURE!!");
					}
				}
				
			else if(c==8) {
				
				break; //the loop
			}
			
			else {
				System.out.println("\n\n\t\ttry again\n\n _____________________");
			}
		
		}
		
		System.out.println("Thank you!!\n see you again");
		
		// arraylist > resultset ka data... foreach ka use karke display
		// select sum()
		// stream api
		// 

}
}
