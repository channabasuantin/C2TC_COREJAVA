package com.src;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter student's Id:");
		int studentId=sc.nextInt();
		System.out.println("Enter Student's Name:");
		String studentName=sc.next();
		System.out.println("Enter Student's address:");
		String studentAddress=sc.next();
		while(true) {
			System.out.println("Wheather the student is from NIT(Yes/No):");
			String collegeName=sc.next();
			if(collegeName.equalsIgnoreCase("Yes")) {
				collegeName="NIT";
				StudentDetails s=new StudentDetails(studentId,studentName,studentAddress);
				System.out.println(s);
				break;
			}
			else if(collegeName.equalsIgnoreCase("No")) {
				System.out.println("Enter the college Name:");
				collegeName=sc.next();
				StudentDetails s=new StudentDetails(studentId,studentName,studentAddress,collegeName);
			    System.out.println(s);
			    break;
			}
			else {
				System.out.println("Wrong Input");
			}
			
		
		
		}
	}

}
