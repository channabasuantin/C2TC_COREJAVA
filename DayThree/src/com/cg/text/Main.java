package com.cg.text;


//importing the person class from demo package

//import com.cg.demo.Person;

public class Main {

	public static void main(String[] args) {
		
		//using fully qualified name
		com.cg.demo.Person p=new com.cg.demo.Person();
		com.cg.demo.employee e=new com.cg.demo.employee();
		
		System.out.println(p);
		System.out.println(e);

	}

}
