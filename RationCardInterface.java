package com.src;

public class RationCardInterface {
	public static RationCard extractDetails(String cardDetails) {
		String details[]=cardDetails.split(":");
		return new RationCard(details[0],details[1],details[2],Double.parseDouble(details[3]),Double.parseDouble(details[4]));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
