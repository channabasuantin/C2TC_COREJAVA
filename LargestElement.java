package com.src;

public class LargestElement {

	int a[]= {1,2,3,10,7};
	int max=a[0];
	 int largest() {
	for(int i=0;i<a.length;i++) {
		
		if(a[i]>max) {
		max=a[i];
			return max;
		}
	}
	return max;
	}
	public static void main(String[] args) {
		
		

	}

		}
