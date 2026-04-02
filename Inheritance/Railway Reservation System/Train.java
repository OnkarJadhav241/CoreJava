package com.railwayreservationsystem;

public class Train extends RailwayReservationSystem {

	private String trainName;
	private int trainNumber;

	void setTrainDetails(String trainName, int trainNumber) {
		this.trainName = trainName;
		this.trainNumber = trainNumber;
	}

	void displayTrainDetails() {
		displaySystemInfo();
		System.out.println("------------Train Details-------------");
		System.out.println("Train Name: " + trainName);
		System.out.println("Train Number: " + trainNumber);
		System.out.println("-----------------------------------------");
	}
}
