package com.cg.generics;

import java.util.List;

public class LowerboundedWildCard {
	public static void displayNumber(List<?super Integer>list) {
		
		for(Object n:list) {
			System.out.println(n);
		}
		
	}

	
}
