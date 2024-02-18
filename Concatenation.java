package com.src;
import java.util.Scanner;

public class Concatenation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Inmate's name:");
		String s=sc.nextLine();
		System.out.println("Inmate's father's name:");
		String s1=sc.nextLine();
		
		if(s.matches("^[A-Za-z ]*$")==true && s1.matches("^[A-Za-z ]*$"))
		{
			String s2=(s.toUpperCase()+" "+s1.toUpperCase());
			System.out.println(s2);
		}
		else {
			System.out.println("Invalid name");
		}

	}

}
