package com.src;

import java.util.Scanner;

public class DeletingElement {

	public static void main(String[] args) {
		int a[]=new int[10];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		a[6]=7;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element to delete at particular index");
		int index=sc.nextInt();
		
		int n=7;
		for(int i=a.length-1;i<n-1;i++) {
			
			a[i]=a[i-1];
		}
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
