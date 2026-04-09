package com.vehiclesystem;

public class Bike implements Vehicle {

	@Override
	public void start(String color) {
		if (color == "green") {
			System.out.println("Start the Bike..!");
		} else {
			System.out.println("invalid color");
		}
	}

	@Override
	public void stop(String color) {
		if (color == "red") {
			System.out.println("Stop the Bike..!");
		} else {
			System.out.println("Invalid color");
		}

	}

}
