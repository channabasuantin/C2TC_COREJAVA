package com.src;

import java.util.Scanner;

public class IncrementCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary");
		double salary=sc.nextDouble();
		System.out.println("Enter the performance apparaisal rating");
		double rating=sc.nextDouble();
		if(salary<=0||(rating <1&& rating>5) ) {
			System.out.println("Invalid Input");
		}
		else if(rating >=1 && rating<=3) {
			salary=salary+(0.1*salary);
			System.out.println((int)salary);
			
		}
		else if(rating >3 && rating <=4) {
			salary=salary+(.25*salary);
			System.out.println((int)salary);
		}
		else if(rating >4 && rating<=5) {
			salary=salary+(0.3*salary);
			System.out.println((int)salary);
		}
		
		

	}

}
