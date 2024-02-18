package com.src;
import java.util.Scanner;
public class Main {

	 static Hosteller h=new Hosteller();
	static Scanner s=new Scanner(System.in);
	public static Hosteller getHostellerDetails() {
	System.out.println("Enter the details:");
	System.out.println("Student Id");
	int studentId=s.nextInt();
	
	System.out.println("Student Name");
	String name=s.nextLine();
	
	System.out.println("Department Id");
	int departmentId=s.nextInt();

	System.out.println("gender");
	String gender=s.nextLine();
	
	System.out.println("Phone Number");
	String phone=s.nextLine();
	
	System.out.println("Hostel Name");
	String hostelName=s.nextLine();
	
	System.out.println("Room Number");
	int roomNumber=s.nextInt();
	
	
	
	
		
		
		
		
		return h;
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		

	}

}
