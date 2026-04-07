package com.vehiclescontrols;

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Start the Car...!");
	}

	@Override
	public void stop() {
		System.out.println("Stop the Car...!");

	}
}
