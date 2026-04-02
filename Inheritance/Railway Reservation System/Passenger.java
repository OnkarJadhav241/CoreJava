package com.railwayreservationsystem;

public class Passenger extends RailwayReservationSystem {

	private String fullname;
	private long mobileno;
	private long adharno;
	private int age;

	public void PassengerDetails(String fullname, long mobileno, long adharno, int age) {
		this.fullname = fullname;
		this.mobileno = mobileno;
		this.adharno = adharno;
		this.age = age;
	}

	public void displayPassengerDetails() {
		displaySystemInfo();
		System.out.println("-----------Passenger Details-------------");
		System.out.println("Full Name : " + fullname);
		System.out.println("Moblie No. : " + mobileno);
		System.out.println("Adhar No. : " + adharno);
		System.out.println("Age : " + age);
		System.out.println("-----------------------------------------");
	}

}
