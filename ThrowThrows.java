package com.src;

public class ThrowThrows {
	
	static int area(int l,int b) {
		if(l<0||b<0) {
			throw new ArithmeticException("cannot be less than zero");
		}
		else {
			int a=l*b;
			return a;
		}
		
		
	}

	public static void main(String[] args) {
		ThrowThrows obj=new ThrowThrows();
		System.out.println(obj.area(30, 2));

	}

}
