package com.src;

public class Rotating {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		for(int x:a) {
			System.out.println(x+" ");
			System.out.println("");
		}
		int temp=a[0];
		int i;
		for(i=1;i<a.length;i++) {
			
			a[i-1]=a[i];
		}
		a[a.length-1]=temp;
		for(int x:a) {
			System.out.println(x+" ");
			System.out.println("");
		}

	}

}
