package com.constuctor;

public class Employee {

	public Employee(int empId, String empName, int empAge, String empCity, String empGender, long empMobileNo,
			String empQualification) {
		System.out.println("--------------EMPLOYEE INFORMATION_------------");
		System.out.println("Employee Name :- " + empName);
		System.out.println("Employee Age :- " + empAge);
		System.out.println("Employee City :- " + empCity);
		System.out.println("Employee Gender :- " + empGender);
		System.out.println("Employee MobileNo. :- " + empMobileNo);
		System.out.println("Employee Qualification :- " + empQualification);
	}

	public void calculateSalary(double salary,double bonus) {
        double total = salary + bonus;
        System.out.println("Total Salary: " + total);
    }

}
