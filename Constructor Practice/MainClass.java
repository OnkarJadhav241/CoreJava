package com.constructor;

public class MainClass {

	public static void main(String[] args) {

//		Student s1 = new Student(101, "Shivam Jadhav", 21, "Pune", "Male", 9876543210L, "Computer Science");
//		s1.displayStudentInformation();

//		MyPortFolio myInfo = new MyPortFolio("Onkar", "Jadhav", 22, "Diploma In Computer Engineering",
//				"Btech In Computer Enggineering", "onkarjadhav@gmail.com", 9876543210l, 7.5);
//		myInfo.displayMyPortFolio();

//		Car bmw = new Car("X5", "BMW", "Black", 3000," SUV", 2023,9500000);
//		bmw.displayCarDetails();

//		Employee emp = new Employee(123, "Shlok Jadhav", 26, "Pune", "Male", 9876543210l,
//				"Btech in Computer Engineering");
//		emp.displayEmployeeDetails();
//		emp.calculateSalary(750000, 1256);

//		Patient pat =new Patient(123, "Pranav Patil", 24, "Pune", "Male", 9865743210l, "Cold,Fever");
//		pat.showPatientDeatils();

//		Doctor dr =new Doctor(123, "Rudra Yadav", 35, "Pune", "Male", 9382714650l, "Surgen");
//		dr.showDoctorDetails();

//		BankAccount acc =new BankAccount(987454612312l, " Onkar Jadhav", "HDFC", "Chichwad", 9518476230l, 9500000);
//		acc.showAccountDetails();

		Product p = new Product(125, "Handwash", 100, 3, "detol");
		p.showProductDetails();
		p.displayBill();

	}

}
