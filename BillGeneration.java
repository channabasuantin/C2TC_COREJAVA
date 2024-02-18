package com.src;
import java.util.Scanner;
public class BillGeneration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of pizzas bought:");
		int pizzas=sc.nextInt();
		System.out.println("Enter the no of puffs bought:");
		int puffs=sc.nextInt();
		System.out.println("Enter the no of cool drinks bought:");
		int cooldrinks=sc.nextInt();
		System.out.println("BillDetails");
		System.out.println("No of pizzas:"+pizzas);
		System.out.println("NO of puffs:"+puffs);
		System.out.println("No of cooldrinks:"+cooldrinks);
		int total_price=pizzas*100+puffs*20+cooldrinks*10;
		System.out.println("total_price="+total_price);
		
		System.out.println("ENJOY THE SHOW!!!");

	}

}
