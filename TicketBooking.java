package com.oops;

class TicketBooking {
	static private int totalTickets =100;
	static private int availableTickets = 100;
	
	static 
	{
		System.out.println("Availble tickets are : "+ availableTickets);
	}
	
	static void bookTickets(int tickets)
	{
		if(availableTickets < tickets)
		{
			System.out.println("Sorry, only "+ availableTickets + "  are available !!!");
		}
		else
		{
			System.out.println( tickets + " tickets are booked !!!");
			availableTickets -=tickets;
			System.out.println("Available tickets are : "+ availableTickets);
		}
	}
	static void refillTicktes()
	{
		availableTickets = totalTickets;
	}
	static void refillTicktes(int tickets)
	{
		availableTickets = tickets;
	}
	
	
}
