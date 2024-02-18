package com.src;

public class Throws {
	public static int division(int a,int b) throws ArithmeticException{
		int div=a/b;
		return div;
	}
	

	public static void main(String[] args) {
		Throws obj=new Throws();
		try {
			System.out.println(obj.division(30,0));
			
		}
		catch(ArithmeticException e) {
			System.out.println("devided by zero");
		}

	}

}
