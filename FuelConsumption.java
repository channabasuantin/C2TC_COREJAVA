package com.src;

import java.util.Scanner;

public class FuelConsumption {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of liters to fill the tank");
		float liters=sc.nextInt();
		if(liters>0) {
		        System.out.println("Enter the distance covered");
		        float distance=sc.nextInt();
		        if(distance<0) {
		        	System.out.println(distance+" is an Invalid input");
		        }
		        else {
		             double miles=distance*0.6214;
		             double gallons=liters*0.2642;
		             
		             System.out.println("Liters/100KM");
		             System.out.printf("%.2f",(liters*100)/distance);
		             System.out.println();
		             System.out.println("Miles/gallons");
		             System.out.printf("%.2f",miles/gallons);
		            
		        }

	}
		else {
			System.out.println(liters+"is a invalid input");
		}

}
}
