package com.EmployeesData;

public class Employee {
	private int empId;
	private String empName;
	private String dob;
	private int managerId;
	private String email;
	private float salary;
	
	
	public Employee(String empName, String dob, int managerId, String email, float salary) {
		super();
		this.empName = empName;
		this.dob = dob;
		this.managerId = managerId;
		this.email = email;
		this.salary = salary;
	}


	public Employee(int empId, String empName, String dob, int managerId, String email, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dob = dob;
		this.managerId = managerId;
		this.email = email;
		this.salary = salary;
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public int getManagerId() {
		return managerId;
	}


	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
