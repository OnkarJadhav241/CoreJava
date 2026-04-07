package com.employeeinfo;

public class PartTimeEmployee implements Employee{
	
	@Override
	public void calculateSalary(double salary) {
		System.out.println("Salary is :" + salary);

	}

}
