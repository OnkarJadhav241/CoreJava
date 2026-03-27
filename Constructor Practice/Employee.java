package com.constructor;

public class Employee {

	int empId;
	String empName;
	int empAge;
	String empCity;
	String empGender;
	long empMobileNo;
	String empQualification;

	public Employee(int empId, String empName, int empAge, String empCity, String empGender, long empMobileNo,
			String empQualification) {
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empCity = empCity;
		this.empGender = empGender;
		this.empMobileNo = empMobileNo;
		this.empQualification = empQualification;
	}

	public void calculateSalary(double salary, double bonus) {
		double total = salary + bonus;
		System.out.println("Total Salary: " + total);
	}

	public void displayEmployeeDetails() {
		System.out.println("--------------EMPLOYEE INFORMATION_------------");
		System.out.println("Employee ID :- " + empId);
		System.out.println("Employee Name :- " + empName);
		System.out.println("Employee Age :- " + empAge);
		System.out.println("Employee City :- " + empCity);
		System.out.println("Employee Gender :- " + empGender);
		System.out.println("Employee MobileNo. :- " + empMobileNo);
		System.out.println("Employee Qualification :- " + empQualification);
	}
}
