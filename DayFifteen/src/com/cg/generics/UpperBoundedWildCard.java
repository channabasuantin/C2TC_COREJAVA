package com.cg.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UpperBoundedWildCard {

	
	public static Double sumoflist(ArrayList<? extends Number>list) {
		double sum=0.0;
		Scanner sc=new Scanner(System.in);
		int list=sc.nextint();
		for(Number a1:list) {
			sum=sum+a1.doubleValue();
		}
		return sum;
	}

	
}

