package com.src;

import java.util.Date;

public class GreatBeginnings {
     String eventId;
     String eventType;
     Date dateOfRegistration;
     double payment;
     
     
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public Date getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(Date dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public GreatBeginnings(String eventId, String eventType, Date dateOfRegistration, double payment) {
		super();
		this.eventId = eventId;
		this.eventType = eventType;
		this.dateOfRegistration = dateOfRegistration;
		this.payment = payment;
	}
	public double calculateAmountToBePaid() {
		if(payment<=0) {
			return -1;
		}
		double discount;
		switch(eventType) {
		case "Weddings":discount=12;
		break;
		case "Charity":discount=9;
		break;
		case "ProductLaunch":discount=15;
		break;
		case "Exhibition":discount=5;
		break;
		case "Workshops":discount=7;
		break;
		default:return -1;
		
		
		}
		return payment-(payment*discount)/100;
	}
	
	
     
     
}
