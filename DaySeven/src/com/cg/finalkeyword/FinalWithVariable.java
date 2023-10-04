package com.cg.finalkeyword;

public class FinalWithVariable {
	private final int a=10;// must be initialized the value of a in case of final u declare the variable;

	public FinalWithVariable() {
	//xxx	a=12;
		// TODO Auto-generated constructor stub
		System.out.println("can't re-assign the value of a:"+a);
		
			
		}
	void display() {
		System.out.println("value of a:"+a);
	}
	

}
