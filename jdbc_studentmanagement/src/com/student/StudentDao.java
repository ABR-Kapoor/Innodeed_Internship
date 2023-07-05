package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.lang.model.element.NestingKind;

import com.mysql.cj.protocol.a.result.ResultsetRowsStatic;

public class StudentDao {
		public static boolean insertStudentToDb(Student s) {
			boolean f=false;
			
			try {
				
				//we are going to create conncetion
				Connection con= CP.CreateC();
				String sql=  "insert into students(sname, sphone, scity) values(?,?,?) "; // ? ka matlb 																					dynamaic query bana rahe hai... parametreised
				
				//kyoki ye dynamic query hai toh 'preparedStatement'
				PreparedStatement pstat=con.prepareStatement(sql);
				
				//set the values of parameters
				pstat.setString(1, s.getStudentName());
				pstat.setString(2, s.getStudentphone());
				pstat.setString(3, s.getStudentCity());
				
				//execute
				int i=pstat.executeUpdate();
				if(i==1) {
				f=true;
				}
			} catch (Exception e) {
				System.out.println("bro! there is a problem to connect...");
			}
			return f;
			
		}
		
		public static boolean deleteStudentToDb(int the_id) {
			boolean f=false;
			
			try {
				
				//we are going to create conncetion
				Connection con= CP.CreateC();
				
				String sql=  "delete from students where sid=?"; // ? ka matlb 																					dynamaic query bana rahe hai... parametreised
				
				//kyoki ye dynamic query hai toh 'preparedStatement'
				PreparedStatement pstat=con.prepareStatement(sql);
				
				//set the values of parameters
				pstat.setInt(1, the_id);
				
				//execute
				pstat.executeUpdate();
				f=true;
			} catch (Exception e) {
				System.out.println("bro! there is a problem to connect...");
			}
			return f;
			
		}
		static int a=0;
		public static void showAllStudents() {
			// TODO Auto-generated method stub
try {
				
				//we are going to create conncetion
				Connection con= CP.CreateC();
				
				String sql=  "select * from students"; // ? ka matlb 																					dynamaic query bana rahe hai... parametreised
				
				Statement stat=con.createStatement();
				
				ResultSet set= stat.executeQuery(sql);
				
				
				
				while(set.next()) {
					int id= set.getInt(1);
				   String name = set.getString(2);
				   String phone= set.getString("sphone");
				   String city=set.getString(4);
				   
				   System.out.println("\n\n __________________________\n\nId: "+id+"\nname: "+name+"\nphone: "+phone+"\ncity: "+city);
				   a++;
				}
			} catch (Exception e) {
				System.out.println("bro! there is a problem to connect...");
			}
		}
		
		
}
