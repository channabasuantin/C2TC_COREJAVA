package com.src;

public class UserInterface1 {
	public static LaptopInfo extractDetails(String laptopDetails) {
		String details[]=laptopDetails.split(":");
		return new LaptopInfo(details[0],details[1],details[2],Double.parseDouble(details[3]));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
