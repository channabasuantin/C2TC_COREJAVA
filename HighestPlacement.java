package com.src;

import java.util.Scanner;

public class HighestPlacement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students placed in CSE:");
		int cse=sc.nextInt();
		System.out.println("Enter the no of students placed in ece:");
		int ece=sc.nextInt();
		System.out.println("Enter the no of students placed in mech:");
		int me=sc.nextInt();
		if(ece<0 || cse<0||ece<0) {
			System.out.println("Input is Invaid");
		}
		else if(ece==me && ece==cse && me== cse) {
			System.out.println("None of the department has got the highest placement");
			
		}
		else if(ece>cse &&ece>me) {
			System.out.println("Highest placement ece");
			
		}
		else if(cse>ece&& cse>me) {
			System.out.println("Highest placement CSE");
		}
		else if(me>ece&&me>cse) {
			System.out.println("Highest placement MECH");
		}
		else if(ece==cse&&ece>me) {
			System.out.println("Highest placement ECE AND CSE");
		}
		else if(cse==me && cse>ece) {
			System.out.println("highest placement cse and mech");
		}
		else if(ece==me&&ece>cse) {
			System.out.println("highest placement ece and mech");
		}
		
	}

}
