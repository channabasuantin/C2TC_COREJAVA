package com.src;

public class SecondLargest {

	public static void main(String[] args) {
		int max1;
		int max2;
		int a[]= {3,9,7,8,12,6,15,5,4,10};
		max1=max2=a[0];
		for(int i=0;i<a.length;i++) {
		if(a[i]>max1) {
			max2=max1;
			max1=a[i];
		}
		else if(a[i]>max2){
			max2=a[i];
		}
	}
		System.out.println("Second largest element is: "+max2);
	}
}
