package com.src;

public class Ticket {

	private int ticketid;
	private int price;
	private static int availableTickets;
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid=ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getAvailableTickets(){
		return availableTickets;
	}
	public void setAvailableTickets(int availableTickets) {
		if(availableTickets>0)
		Ticket.availableTickets=availableTickets;
	}
	public int calculateTicketCost(int bookings) {
		if(availableTickets>=bookings) {
			availableTickets=availableTickets-bookings;
			return bookings*price;
		}
		return -1;
	}
}
