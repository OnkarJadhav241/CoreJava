package com.polymorphism;

public class Student {
	int id;
	String name;

	public Student() {
	       
	    }

	public Student(int id) {
	        this.id = id;
	    }

	public Student(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	// Method to display student info
	public void display() {
		System.out.println("ID: " + id);
		System.out.println(" Name: " + name);
	}
}
