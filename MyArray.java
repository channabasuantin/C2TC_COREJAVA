package com.src;

public class MyArray<T> {
	T A[]=(T[])new Object[10];
	int length=0;
	
	public void append(T v) {
		A[length++]=v;
		
	}
	public void display() {
		/*
		 * for(int i=0;i<length;i++) { System.out.println(A[i]); }
		 */
		for(T x:A) {
			System.out.println(x);
		}
	}

	
}
