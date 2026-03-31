package com.encapsulationpractice;

//11.  Create a non-parameterized constructor that prints “Object Created”.

//12.  Create a parameterized constructor for a class Book to initialize title and price.
//Print book information.**

public class Book {

	String bookTitle;
	double bookPrice;

	public Book() {
		System.out.println("Object Created");
	}

	public Book(String bookTitle, double bookPrice) {
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}

	public void showBook() {
		System.out.println("---------------BOOK INFORMATION---------------");
		System.out.println("Book Title : " + bookTitle);
		System.out.println("Book Price : " + bookPrice);
	}

}
