package com.src;

public class Throw {
	public static void checkNum(int num) {
		if(num<0) {
		throw new ArithmeticException("/n number is negative,cannot calculate square.");
	}
		else {
			System.out.println("square of"+num+"is"+(num*num));
		}
		
	}

		
	public static void main(String[] args) {
		Throw obj=new Throw();
		obj.checkNum(-3);
		

	}

}