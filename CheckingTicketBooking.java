/**
 * 
 */
package com.oops;
import java.util.Scanner;
/**
 * @author HP
 *
 */
public class CheckingTicketBooking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		@SuppressWarnings("unused")
		TicketBooking tb = new TicketBooking();
		int tickets;
		do{
			System.out.print("Enter how many tickets do you want to book, -1 to exit : ");
			tickets = read.nextInt();
			TicketBooking.bookTickets(tickets);
		}while(tickets != -1);
		read.close();
	}

}
