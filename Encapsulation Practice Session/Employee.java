package com.encapsulationpractice;

public class Employee {
	private double empSalary;

	public double getSalary() {
		return empSalary;
	}

	public void setSalary(double empSalary) {
		if (empSalary > 0) {
			this.empSalary = empSalary;
		} else {
			System.out.println("Salary must be Greater than 0");
		}
	}

}
