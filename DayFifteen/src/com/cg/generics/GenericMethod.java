package com.cg.generics;

public class GenericMethod {
	
	
	public <E>void displayArrayElements(E[] elements) {
		
		for(E a:elements) {
			System.out.println(a);
		}
		
		
		
	}


void display(Person p) {
	
	System.out.println(p);
	
}


}