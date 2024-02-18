package com.src;

public class UserInterface {
	public static EmployeeInfo ExtractDetails(String employeeDetails) {
		String details[]=employeeDetails.split(":");
		return new EmployeeInfo(details[0],details[1],details[2],Integer.parseInt(details[3]),Integer.parseInt(details[4]));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
