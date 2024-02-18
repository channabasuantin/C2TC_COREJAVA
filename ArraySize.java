package com.src;

public class ArraySize {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int b[]=new int[15];
		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		a=b;
	
			System.out.println(a.length);
			//System.out.println(x);
		
	}

}
