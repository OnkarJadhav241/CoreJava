package com.railwayreservationsystem;

public class MainClass {

	public static void main(String[] args) {
		
		Passenger p =new Passenger();
		p.PassengerDetails("Shivam Jadhav", 9876543210l, 963857421091l, 23);
		p.displayPassengerDetails();
		
		Ticket t = new Ticket();
		t.bookTicket(101, "PUNE", "SATARA");
		t.displayTicketDetails();
		
		Train tr = new Train();
		tr.setTrainDetails("KOYNA EXPRESS", 114521);
		tr.displayTrainDetails();
		
		

	}

}
