package com.railwayreservationsystem;

public class Ticket extends RailwayReservationSystem {

	private int ticketNumber;
	private String source;
	private String destination;

	public void bookTicket(int ticketNumber, String source, String destination) {
		this.ticketNumber = ticketNumber;
		this.source = source;
		this.destination = destination;
	}

	public void displayTicketDetails() {
		displaySystemInfo();
		System.out.println("------------Ticket Details-------------");
		System.out.println("Ticket Number: " + ticketNumber);
		System.out.println("Source: " + source);
		System.out.println("Destination: " + destination);
		System.out.println("-----------------------------------------");
	}
}
