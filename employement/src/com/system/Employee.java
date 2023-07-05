package com.system;

public class Employee {
	private int empId;
	private String empName;
	private String dob;
	private int managerId;
	private String email;
	
	
	public Employee(int empId, String empName, String dob, int managerId, String email) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dob = dob;
		this.managerId = managerId;
		this.email = email;
	}


	public Employee(String empName, String dob, int managerId, String email) {
		super();
		this.empName = empName;
		this.dob = dob;
		this.managerId = managerId;
		this.email = email;
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


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dob=" + dob + ", managerId=" + managerId
				+ ", email=" + email + "]";
	}
	
	
	
	
	
}
