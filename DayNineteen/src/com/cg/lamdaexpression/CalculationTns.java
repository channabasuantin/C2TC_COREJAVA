package com.cg.lamdaexpression;

public class CalculationTns {

	public static void main(String[] args) {
		AdditionTNS at=(int a,int b)-> (a+b);
		{
			System.out.println("addition of two no:"+(at.addition(3, 10)));
		};

	}

}
