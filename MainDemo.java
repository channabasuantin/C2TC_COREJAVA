package com.src;
//import java.util.Scanner;
public class MainDemo {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the employee ID");
//		int employeeId=sc.nextInt();
//		System.out.println("Enter the employee name");
//		String name=sc.nextLine();
//		System.out.println("Enter the salary");
//		double salary=sc.nextDouble();
		
		PermanentEmployee p=new PermanentEmployee(101,"channabasu",20000);
		TemporaryEmployee t=new TemporaryEmployee(111,"channu",10,2000);
		Loan l=new Loan();
		double per=l.calculateLoanAmount(p);
		double tem=l.calculateLoanAmount(t);
		System.out.println(per);
		System.out.println(tem);
		//l.calculateLoanAmount();

	}

}
