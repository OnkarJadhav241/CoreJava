package com.constructor;

public class Patient {

	int patientId;
	String patientName;
	int patientAge;
	String patientCity;
	String patientGender;
	long patientMobileNo;
	String patientDisease;

	public Patient(int patientId, String patientName, int patientAge, String patientCity, String patientGender,
			long patientMobileNo, String patientDisease) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.patientCity = patientCity;
		this.patientGender = patientGender;
		this.patientMobileNo = patientMobileNo;
		this.patientDisease = patientDisease;
	}

	public void showPatientDeatils() {
		System.out.println("--------------PATIENT INFORMATION_------------");
		System.out.println("Patient ID :- " + patientId);
		System.out.println("Patient Name :- " + patientName);
		System.out.println("Patient Age :- " + patientAge);
		System.out.println("Patient City :- " + patientCity);
		System.out.println("Patient Gender :- " + patientGender);
		System.out.println("Patient MobileNo. :- " + patientMobileNo);
		System.out.println("Patient  Disease:- " + patientDisease);

	}
}
