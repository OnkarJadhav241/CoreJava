package com.employeeinfo;

public class FullTimeEmployee implements Employee {

	@Override
	public void calculateSalary(double salary) {
		System.out.println("Salary is :" + salary);

	}

}
