package com.constructor;

public class Doctor {

	int doctorId;
	String doctorName;
	int doctorAge;
	String doctorCity;
	String doctorGender;
	long doctorMobileNo;
	String specialization;

	public Doctor(int doctorId, String doctorName, int doctorAge, String doctorCity, String doctorGender,
			long doctorMobileNo, String specialization) {
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAge = doctorAge;
		this.doctorCity = doctorCity;
		this.doctorGender = doctorGender;
		this.doctorMobileNo = doctorMobileNo;
		this.specialization = specialization;
	}

	public void showDoctorDetails() {
		System.out.println("Doctor ID: " + doctorId);
		System.out.println("Name: " + doctorName);
		System.out.println("Age: " + doctorAge);
		System.out.println("City: " + doctorCity);
		System.out.println("Gender: " + doctorGender);
		System.out.println("Mobile No: " + doctorMobileNo);
		System.out.println("Specialization: " + specialization);
	}
}
