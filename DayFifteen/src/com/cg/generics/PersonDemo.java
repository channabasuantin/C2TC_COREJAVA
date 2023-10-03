package com.cg.generics;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person<String> p=new Person<>();
		p.setname("channabasu");
		p.setcity("bgk");
		
		System.out.println(p.getname());
		System.out.println(p.getcity());

	}

}
