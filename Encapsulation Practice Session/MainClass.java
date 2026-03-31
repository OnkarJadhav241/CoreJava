package com.encapsulationpractice;

public class MainClass {

	public static void main(String[] args) {

//		Student std = new Student();
//		std.setId(101);
//		std.setName("Onkar Jadhav");
//		System.out.println(std.getId());
//		System.out.println(std.getName());

//		Employee emp =new Employee();
//		emp.setSalary(15201);
//		System.out.println(emp.getSalary());

//		Car car = new Car();
//		car.setBrand("Toyota");
//		car.setPrice(800000);
//		System.out.println(car.getBrand());
//		System.out.println(car.getPrice());

//		Product p = new Product();
//		p.setName("Sugar");
//		p.setPrice(100);
//		p.setQuantity(5);
//		p.setDiscount(5);
//		
//		System.out.println(p.getName());
//		System.out.println(p.getPrice());
//		System.out.println(p.getQuantity());
//		System.out.println(p.getDiscount());
//		System.out.println(p.calculateDiscountedPrice());

//		MethodsExamplePractice m = new MethodsExamplePractice();
//		m.printMessage();
//		m.add(10, 30);
//		System.out.println(m.multiply(20, 5));
//		System.out.println(m.getName());
//		System.out.println(m.isEven(45));

//		Book b= new Book();
//		
//		Book b1 = new Book("Java Programing", 4526);
//		b1.showBook();

		LibraryBook b1 = new LibraryBook(1, "Java Basics", "James");
		b1.displayBook();

		LibraryBook b2 = new LibraryBook(2, "Python Guide", "Guido");
		b2.displayBook();

		LibraryBook b3 = new LibraryBook(3, "C Programming", "Dennis");
		b3.displayBook();
	}
}
