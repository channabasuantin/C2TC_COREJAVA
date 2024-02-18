package com.src;

public class RightRotation {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		for(int x:a) {
			System.out.println(x);
		}
		int temp=a[a.length-1];
		for(int i=1;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[0]=temp;
		for(int x:a) {
			System.out.println(x);
		}
}
}