package com.encapsulationpractice;

public class LibraryBook {
	private int bookId;
	private String bookTitle;
	private String bookAuthor;

	public LibraryBook(int bookId, String bookTitle, String bookAuthor) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}

	public int getBookId() {
		return bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getBookAuther() {
		return bookAuthor;
	}

	public void displayBook() {
		System.out.println("---------------BOOK INFORMATION---------------");
		System.out.println("Book Id : " + bookId);
		System.out.println("Book Title : " + bookTitle);
		System.out.println("Book Author : " + bookAuthor);
	}
}
