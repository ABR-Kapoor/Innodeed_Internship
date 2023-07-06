package com.EmployeesData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SaveEmpDetails {

//    public static boolean writeEmpValues(Employee emp) {
//        boolean success = false;
//
//        try {
//            FileWriter myFileWriter = new FileWriter("D:\\InternshipJavaAdvanceJDBC\\UseFileMngtInEmployee\\src\\com\\employeesData\\EmployeeData.txt",true); // Set the second parameter to 'true' to enable appending
//
//            String employeeData = emp.getEmpName() + "," + emp.getDob() + "," + emp.getManagerId() + "," + emp.getEmail() + "," + emp.getSalary();
//            myFileWriter.write(employeeData);
//            myFileWriter.write(System.lineSeparator()); // Add a new line after each employee entry
//
//            myFileWriter.close();
//            success = true;
//        } catch (IOException e) {
//            System.out.println("An error occurred while writing to the file: " + e.getMessage());
//        }
//
//        return success;
//    }
	
	public static boolean writeEmpValues(Employee emp) {
		boolean hogaya = false;

		try {
			FileWriter myFileWriter = new FileWriter("D:\\InternshipJavaAdvanceJDBC\\EmployeesInFile\\src\\com\\EmployeesData\\EmployeeData.txt",true);
			
			String employeeData = emp.getEmpName() + "," + emp.getDob() + "," + emp.getManagerId() + "," + emp.getEmail() + "," + emp.getSalary();
            myFileWriter.write(employeeData);
            myFileWriter.write(System.lineSeparator()); // Add a new line after each employee entry
			
			hogaya = true;
			myFileWriter.close();

		} catch (IOException e) {
			System.out.println("Some problem occurred while writing to the file!!");
		}

		return hogaya;
	}

	public static boolean removeEmp(String empName) {
        boolean success = false;

        try {
            BufferedReader fileread = new BufferedReader(new FileReader("D:\\InternshipJavaAdvanceJDBC\\EmployeesInFile\\src\\com\\EmployeesData\\EmployeeData.txt"));
            String line;
            StringBuilder saveRestLines = new StringBuilder();

            while ((line = fileread.readLine()) != null) {
                String[] eachdata = line.split(",");
                String onlyname = eachdata[0].trim();
                if (!onlyname.equalsIgnoreCase(empName)) {
                    saveRestLines.append(line).append(System.lineSeparator());
                }
            }
            
            fileread.close();

            FileWriter writer = new FileWriter("D:\\InternshipJavaAdvanceJDBC\\EmployeesInFile\\src\\com\\EmployeesData\\EmployeeData.txt");
            writer.write(saveRestLines.toString());
            writer.close();
            
            success = true;
        } catch (IOException e) {
            System.out.println("Some problem occurred while removing the employee from the file!!");
        }
        
        
        return success;
    }
	
	public static boolean updateEmpValue(String empName, String columnName, String updatedValue) {
	    boolean success = false;

	    try {
	        BufferedReader reader = new BufferedReader(new FileReader("D:\\InternshipJavaAdvanceJDBC\\EmployeesInFile\\src\\com\\EmployeesData\\EmployeeData.txt"));
	        String line;
	        StringBuilder fileContent = new StringBuilder();
	        String name;

	        while ((line = reader.readLine()) != null) {
	            String[] employeeData = line.split(",");
	            name = employeeData[0].trim();

	            if (name.equalsIgnoreCase(empName)) {
	                StringBuilder updatedLine = new StringBuilder();

	                if ((getColumnIndex(columnName)==0)) {
                		updatedLine.append(updatedValue);

                		for (int j = 1; j < employeeData.length; j++) {
                		updatedLine.append(",").append(employeeData[j]);
                		}

                		 line = updatedLine.toString(); 
                		 fileContent.append(line).append(System.lineSeparator());
                		break;
	                }

	                for (int i = 1; i < employeeData.length; i++) {
	                
	                    if (i == getColumnIndex(columnName)) {
	                    	updatedLine.append(name); 
	                        updatedLine.append(",").append(updatedValue);
	                    } else {
	                        updatedLine.append(",").append(employeeData[i]);
	                    }
	                }
	                
	                line = updatedLine.toString(); // Update the line with the modified values
	            }
	            
	            fileContent.append(line).append(System.lineSeparator());
	        }

	        reader.close();

	        FileWriter writer = new FileWriter("D:\\InternshipJavaAdvanceJDBC\\EmployeesInFile\\src\\com\\EmployeesData\\EmployeeData.txt");
	        writer.write(fileContent.toString());
	        writer.close();

	        success = true;
	    } catch (IOException e) {
	        System.out.println("Some problem occurred while updating the employee data in the file!!");
	    }

	    return success;
	}

	private static int getColumnIndex(String colName) {
	    String[] columnNames = { "name", "dob", "managerId", "email", "salary" };

	    for (int i = 0; i < columnNames.length; i++) {
	        if (columnNames[i].equalsIgnoreCase(colName)) {
	            return i;
	        }
	    }
	    return -1;
	}


	public static void readEmpfile() {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("D:\\InternshipJavaAdvanceJDBC\\EmployeesInFile\\src\\com\\EmployeesData\\EmployeeData.txt"));) {
			String line;
	        
	        String values[] =new String[5];

	        while ((line = reader.readLine()) != null) {
	            String[] employeeData = line.split(",");
	            values[0] = employeeData[0].trim();
	            values[1]= employeeData[1].trim();
	            values[2]= employeeData[2].trim();
	            values[3]= employeeData[3].trim();
	            values[4]= employeeData[4].trim();
	            
	            if (values[0].equals("name")) {
					continue;
				}
	            System.out.println("\nName: "+values[0]+"\nDate of birth: "+values[1]+"\nManager Id: "+values[2]+"\nEmail: "+values[3]+"\nSalary: "+values[4]);
	        }
	        } catch (IOException e) {
		        System.out.println("Some problem occurred while updating the employee data in the file!!");
		    }
		
	}

	public static void showByEmpid(String rm) {
		
		try(BufferedReader reader = new BufferedReader(new FileReader("D:\\InternshipJavaAdvanceJDBC\\EmployeesInFile\\src\\com\\EmployeesData\\EmployeeData.txt"));) {
			String line;
	        
	        String values[] =new String[5];

	        while ((line = reader.readLine()) != null) {
	        	
	        		String[] employeeData = line.split(",");
		            values[0] = employeeData[0].trim();
		            
		            if (values[0].equalsIgnoreCase(rm)) {
		            values[1]= employeeData[1].trim();
		            values[2]= employeeData[2].trim();
		            values[3]= employeeData[3].trim();
		            values[4]= employeeData[4].trim();
		            
		            if (values[0].equals("name")) {
						continue;
					}
		            System.out.println("\nName: "+values[0]+"\nDate of birth: "+values[1]+"\nManager Id: "+values[2]+"\nEmail: "+values[3]+"\nSalary: "+values[4]);
		        }
				}
	            
	        } catch (IOException e) {
		        System.out.println("Some problem occurred while updating the employee data in the file!!");
		    }
		
	}
	
	

	
}
