package com.constuctor;

public class Student {

	public Student(int studentId, String studentName, int studentAge, String studentCity, String studentGender,
			long studentMobileNo, String studentCourse) {

		System.out.println("--------------STUDENT INFORMATION--------------");
		System.out.println("Student ID :- " + studentId);
		System.out.println("Student Name :- " + studentName);
		System.out.println("Student Age :- " + studentAge);
		System.out.println("Student City :- " + studentCity);
		System.out.println("Student Gender :- " + studentGender);
		System.out.println("Student MobileNo. :- " + studentMobileNo);
		System.out.println("Student Course :- " + studentCourse);
	}
}
