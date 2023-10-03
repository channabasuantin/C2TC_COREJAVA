package com.cg.generics;

public class GenericMethodDemo {

	public static void main(String[] args) {
	
		Integer intarray[]= {1,2,3,4,54};
		String Stringarray[]= {"a","b","c"};
		Float floatarray[]= {10.0f,20.0f,30.0f};
		
		GenericMethod gm=new GenericMethod();
		gm.displayArrayElements(intarray);
		gm.displayArrayElements(Stringarray);
		gm.displayArrayElements(floatarray);
		
		
		Person[] p= {new Person("DHEU","EJD"),new Person("tre","edbh"),new Person("rdgf","rers") };
		gm.displayArrayElements(p);
	}
}