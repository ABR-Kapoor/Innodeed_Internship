package com.system;

import java.util.ArrayList;

public class SaveEmpList {
	
	public static ArrayList <Employee> empList= new ArrayList<>();
	
//    public static void show() {    	
//
////        for (int i = 1; i < empList.size(); i++) {
////            Employee employee = empList.get(i);
////            System.out.println("Employee #" + (i + 1) + ":");
////            System.out.println("Name: " + employee.getEmpName());
////            System.out.println("DOB: " + employee.getDob());
////            System.out.println("Email: " + employee.getEmail());
////            System.out.println("Manager ID: " + employee.getManagerId());
////            System.out.println("Salary: " + employee.getSalary());
////            System.out.println();
////        }
//    	
//        Employee e = empList.get(1);
//    	System.out.println("name: "+ e.getEmpName());
//    	empList.size();
//    	
//    }
//    
//	public static void saveData(Employee ep) {
////		ArrayList<Employee> emp= new ArrayList<>();
//		empList.add(ep);
//	}
//	
//	public static void fetchData() {
//		empList.stream().forEach(n -> System.out.println(n));
//	}
	
	public static void saveData(Employee employee) {
		empList.add(employee);
    }

    public static void fetchData() {
    	
    	empList.forEach(employee-> {
    		System.out.println("Name: " + employee.getEmpName());
            System.out.println("DOB: " + employee.getDob());
            System.out.println("Manager ID: " + employee.getManagerId());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();
    	});
    	
//        for (Employee employee : empList) {
//            System.out.println("Name: " + employee.getEmpName());
//            System.out.println("DOB: " + employee.getDob());
//            System.out.println("Manager ID: " + employee.getManagerId());
//            System.out.println("Salary: " + employee.getSalary());
//            System.out.println();
//        }
        
        System.out.println(empList.size()+ " row displayed");
}
}