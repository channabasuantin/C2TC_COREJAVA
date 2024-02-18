package com.src;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {0,1,2,3,4,5,6,7,8,9};
		int b[]=new int[10];
		for(int x:b) {
			System.out.println(x);
		}
		for(int i=a.length-1,j=0;i>=0;i--,j++) {
			b[j]=a[i];
		}
		for(int x:b) {
			System.out.println(x);
		}

	}

}
