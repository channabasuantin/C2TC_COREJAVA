package com.src;

public class InsertingArray {

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
		int index=2;
		int x=12;
		int n=7;
		for(int i=n;i>index;i--) {
			a[i]=a[i-1];
			
		}
		a[index]=x;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
