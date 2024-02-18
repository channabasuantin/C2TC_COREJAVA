package com.src;

public class MaxElement {

	public static void main(String[] args) {
		int a[]= {1,2,3,10,5,6,8};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);

	}

}
