package com.src;
import java.util.Scanner;
public class DisplayCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		
		char x=(char)a;
		char y=(char)b;
		char z=(char)c;
		char A=(char)d;
		
		System.out.println(a+"-"+x);
		System.out.println(b+"-"+y);
		System.out.println(c+"-"+z);
		System.out.println(d+"-"+A);
		

	}

}
