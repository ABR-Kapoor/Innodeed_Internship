package com.system;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;


public class OperationEmp{

		public static boolean AddEmp(Employee e) {
			boolean b=false;
			try {
			//create a connection for operations
			Connection con= DbCon.CreateC();     
			String sql = "INSERT INTO Emp (empName, dob, managerId, email, salary) VALUES (?, STR_TO_DATE(?, '%d/%m/%Y'), ?, ?, ?)";

			
			//for dynamic query
			PreparedStatement pstt = con.prepareStatement(sql);
			
			//inserting values
			pstt.setString(1, e.getEmpName());
			pstt.setString(2, e.getDob()); 
			pstt.setInt(3, e.getManagerId());
			pstt.setString(4, e.getEmail());
			pstt.setFloat(5, e.getSalary());
			
			//execute the code
			
			int done =pstt.executeUpdate();	
			if(done==1) {
				b=true;
				return b;
			}
			
			
			} catch (Exception e2) {
				System.out.println(e2);	
				System.out.println("Bro! there is some problem I couldn't insert Your given data");
			}
			
			return b;
		}

		public static boolean dropEmp(int emp_id) {

			boolean f=false;
			
			try {
				
				//we are going to create conncetion
				Connection con= DbCon.CreateC();
				
				String sql=  "delete from emp where empId=?"; // ? ka matlb 																					dynamaic query bana rahe hai... parametreised
				
				//kyoki ye dynamic query hai toh 'preparedStatement'
				PreparedStatement pstt=con.prepareStatement(sql);
				
				//set the values of parameters
				pstt.setInt(1, emp_id);
				
				//execute
				int done =pstt.executeUpdate();	
				if(done==1) {
					f=true;
					return f;
				}
			} catch (Exception e) {
				System.out.println("bro! there is a problem to connect...");
			}
			return f;
			
		}
		
		public static boolean showAll() {			
			boolean b=false;
			
			try {
				
			
			Connection cp= DbCon.CreateC();
			String sql= "select * from emp";
			
			Statement stt= cp.createStatement();
			
			ResultSet set=stt.executeQuery(sql);
			
			while(set.next()) {
				
				
				
				int id= set.getInt(1);
			   String name = set.getString(2);
			   Date dob= set.getDate("dob");
			   String eMail= set.getString("email");
			   int mngerId= set.getInt("managerId");
			   int salary= set.getInt("salary");
			   			   
			   System.out.println("\n __________________________\n\nId: "+id+"\nName: "+name+"\nEmail: "+eMail+"\nDate of birth: "+dob+"\nManager Name: "+mngerId+"\nSalary: "+salary+"\n");
			   }
			} catch (Exception e) {
				System.out.println(e);
				}			
			return b;
		}
		
		public static boolean showEmpByItsId(int emp_id) {
        boolean b=false;
			
			try {
				
			
			Connection con= DbCon.CreateC();
			String sql= "select * from emp where empId="+emp_id;
			
			Statement stt= con.createStatement();
			
			
			ResultSet set= stt.executeQuery(sql);
			
			if (set.next()) {
				int eId=set.getInt(1);
				String eName=set.getString(2);
				Date edob=set.getDate(3);
				int mId=set.getInt(4);
				String eMail=set.getNString("email");
				int salary= set.getInt(5);
				
				System.out.println("\n\nName : "+eName);
				System.out.println("ID : "+ eId);
				System.out.println("Date of Birth :"+edob);
				System.out.println("Email ID : "+eMail);
				System.out.println("His Manger's ID : "+mId);
				System.out.println("Salary : "+salary+"\n");
				b=true;
			}
			
			
			} catch (Exception e) {
					System.out.println("\n\n\t\tna ho payega bhai... khud kar le delete kyoki:"+e+"\n\n\t\t");
			}
			
			return b;
		}

		public static boolean showEmpByMngerId(int emp_id) {
			boolean b=false;
			
			try {
				
			
			Connection con= DbCon.CreateC();
			String sql= "select * from emp where managerId="+emp_id;
			
			Statement stt= con.createStatement();
			
			
			ResultSet set= stt.executeQuery(sql);
			
			if (set.next()) {
				int eId=set.getInt(1);
				String eName=set.getString(2);
				String edob=set.getString(3);
				int mId=set.getInt(4);
				String eMail=set.getNString("email");
				int sala= set.getInt(5);
				
				System.out.println("\n\nName : "+eName);
				System.out.println("ID : "+ eId);
				System.out.println("Date of Birth :"+edob);
				System.out.println("Email ID : "+eMail);
				System.out.println("His Manger's ID : "+mId);
				System.out.println("Salary: "+sala+"\n");
				b=true;
			}
			
			
			} catch (Exception e) {
					System.out.println("\n\n\t\tna ho payega bhai... khud kar le delete kyoki:"+e+"\n\n\t\t");
			}
			
			return b;
		}

		public static boolean updateValueStr(int emp_id, String what, String val) {
			boolean b=false;
			try {
		    	Connection con= DbCon.CreateC();
				Statement stt = con.createStatement();
		        String sql = "UPDATE emp SET "+what+" = '" + val + "' WHERE empId = " + emp_id;
		        stt.executeUpdate(sql);
		        b=true;
		    	} catch (Exception e) {
					System.out.println("\n\n\tProblem occur to update employee's detail whic is: "+e);
				}
			return b;
		}

		public static boolean updateValueInt(int emp_id, String what, int val) {
			boolean b=false;
			try {
		    	Connection con= DbCon.CreateC();
				Statement stt = con.createStatement();
		        String sql = "UPDATE emp SET "+what+" = " + val + " WHERE empId = " + emp_id;
		        stt.executeUpdate(sql);
		        b=true;
		    	} catch (Exception e) {
					System.out.println("\n\n\tProblem occur to update employee's detail whic is: "+e);
				}
			return b;
		}

		
//		public static boolean IncreamentSalary(int id, int percentage) {
//			boolean b=false;
//			try {
//			
//			Connection con = DbCon.CreateC();
//			String sql= "update emp set salary = salary+(salary*"+percentage+")/100 where empId="+id+"\n";
//			Statement stt= con.createStatement();
//			
//			int done = stt.executeUpdate(sql);
//			if (done==1) {
//				b=true;
//			}
//			
//			} catch (Exception e) {
//				System.out.println("\n\tSome problems Occur see this: "+e);
//			}
//			
//			return b;
//		}

		
		
}
		
			