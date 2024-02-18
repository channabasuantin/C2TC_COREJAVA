package com.src;
import java.util.Scanner;
public class TicketDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ticket t=new Ticket();
		System.out.println("Enter no of bookings:");
		int bookings=sc.nextInt();
		System.out.println("Enter the available tickets:");
		int availableTickets=sc.nextInt();
		t.setAvailableTickets(availableTickets);
		for(int i=0;i<bookings;i++) {
			System.out.println("Enter the ticketid");
			int ticketid=sc.nextInt();
			System.out.println("Enter the price");
			int price=sc.nextInt();
			t.setPrice(price);
			t.setTicketid(ticketid);
			System.out.println("Enter the no of tickets:");
			int notickets=sc.nextInt();
			System.out.println("Available tickets "+t.getAvailableTickets());
			System.out.println("Total Amount: "+t.calculateTicketCost(bookings));
			System.out.println("Available ticket after booking:"+t.getAvailableTickets());
			
		
		
		
		}
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		

	}





	/*
	 * public static void main(String[] args) { Scanner sc=new Scanner(System.in);
	 * Ticket t=new Ticket(); System.out.println("Enter no of bookings:"); int
	 * bookings=sc.nextInt(); System.out.println("Enter the available tickets"); int
	 * availableTickets=sc.nextInt(); t.setAvailableTickets(availableTickets);
	 * for(int i=0;i<=bookings;i++) {
	 * 
	 * System.out.println("Enter the ticketid:"); int ticketid=sc.nextInt();
	 * System.out.println("Enter the price:"); int price=sc.nextInt();
	 * System.out.println("Enter the no of tickets"); int notickets=sc.nextInt();
	 * t.setTicketid(ticketid); t.setPrice(price);
	 * System.out.println("Availbale ticket: "+t.getAvailableTickets());
	 * System.out.println(t.calculateTicketCost(bookings));
	 * System.out.println("Available tickets after bookings:"+t.getAvailableTickets(
	 * ));
	 * 
	 * }
	 */
	
	



