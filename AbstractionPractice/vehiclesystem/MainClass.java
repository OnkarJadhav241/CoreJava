package com.vehiclesystem;

public class MainClass {

	public static void main(String[] args) {
		
		Vehicle car = new Car();
		car.start("green");
		car.start(null);
		car.stop("red");
		car.stop(null);
		
		System.out.println("-----------------------------------------");
		
		Vehicle bike = new Bike();
		bike.start("green");
		bike.start(null);
		bike.stop("red");
		bike.stop(null);

	}

}
