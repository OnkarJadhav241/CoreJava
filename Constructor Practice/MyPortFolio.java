package com.constructor;

public class MyPortFolio {

	String fname;
	String lname;
	int age;
	String pastQualification;
	String currentQualification;
	String email;
	long mobileNo;
	double percentage;
	
	public MyPortFolio(String fname, String lname, int age, String pastQualification, String currentQualification,
			String email, long mobileNo, double percentage) {
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.pastQualification = pastQualification;
		this.currentQualification = currentQualification;
		this.email = email;
		this.mobileNo = mobileNo;
		this.percentage = percentage;
	}

	public void displayMyPortFolio() {
		System.out.println("--------My Information----------");
		System.out.println("First Name :- " + fname);
		System.out.println("Last Name :- " + lname);
		System.out.println("Age :- " + age);
		System.out.println("Past Qualification :- " + pastQualification);
		System.out.println("Current Qualification :- " + currentQualification);
		System.out.println("Email Id :- " + email);
		System.out.println("Mobile No :- " + mobileNo);
		System.out.println("Precentage :- " + percentage + " CGPA");

	}

}
