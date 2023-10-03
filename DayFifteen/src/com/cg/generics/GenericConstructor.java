package com.cg.generics;

public class GenericConstructor{
	
   private int v;
	
	public <T extends Number> GenericConstructor(T t) {
		
	 v=	t.intValue();
	}

	void show() {
		System.out.println(v);
	}
}
