package com.cg.statickeyword;
public class StaticMethod {
	 private int inum;
	 private static int num;
	 
	 public static void staticmethodAction() {
		 num=10;
		 System.out.println("static method:"+num);
		// xxx  inum=12; cannot access instance variable in static method
		 StaticMethod a=new StaticMethod();
		 a.inum=12;
		 System.out.println("Create a instance in static area then access a instance variable:"+a.inum);
		 
	 }
	 public void nonStaticMethodAction() {
		
		 System.out.println("access instance variable in instance method:"+inum);
		 num=14;
		 System.out.println("access static variable in instance method and also change the value of static variable in instance method:"+num);
		 
	 }

	}
