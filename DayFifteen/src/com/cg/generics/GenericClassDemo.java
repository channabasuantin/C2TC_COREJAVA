package com.cg.generics;

public class GenericClassDemo {

	public static void main(String[] args) {
		
		GenericClass<Integer> gc=new GenericClass<>();
		gc.set(10);
		System.out.println(gc.get());
		
		GenericClass<Float> gcOne=new GenericClass<>();
		gcOne.set(10.0f);
		System.out.println(gcOne.get());
		
		
		GenericClass<String> gcTwo=new GenericClass<>();
		gcTwo.set("Hello");
		System.out.println(gcTwo.get());
		

	}

}
