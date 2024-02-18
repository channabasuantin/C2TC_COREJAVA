package com.src;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMainCode {
	public static void main(String[]args) {
//		Scanner sc=new Scanner(System.in);
//		ArrayList<Integer> al=new ArrayList<Integer>();
//		int len=sc.nextInt();
//		for(int i=0;i<len;i++) {
//			al.add(sc.nextInt());
//		}
//		al=MainCode.removeMultiplesOfThree(al);
//		for(int  a:al) {
//			System.out.println(a);
//		}
		
		
		
		
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int reversed=MainCode.revereseNumber(number);
		System.out.println(reversed);
	}

}
