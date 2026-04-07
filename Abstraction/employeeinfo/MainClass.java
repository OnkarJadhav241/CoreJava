package com.employeeinfo;

public class MainClass {

	public static void main(String[] args) {
		
		Employee e = new FullTimeEmployee();
		e.calculateSalary(950000);
		
		Employee e1 = new PartTimeEmployee();
		e1.calculateSalary(450000);
	}

}
