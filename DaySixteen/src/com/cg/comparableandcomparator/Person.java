package com.cg.comparableandcomparator;

import java.util.Comparator;

public class Person {
	private String name;
	private String city;
	
	
	public Person(String name,String city) {
		super();
		this.name=name;
		this.city=city;
	}
	
	public Person() {
		super();
	}
	
	
	public String getcity() {
		return city;
		
	}
	
	public void setcity(String city) {
		this.city=city;
	}

	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
	
	
	
}
 class SortByName implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getname().compareTo(o2.getname());
	}
	 
 }
 
 class SortByCity implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getcity().compareTo(o2.getcity());
	}
	}
 
 
