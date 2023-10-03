package com.cg.generics;

public class Person<T> {
	
	T name;
	T city;
	
	Person(){
		super();
		
	}
	Person(T name,T city){
		super();
		this.name=name;
		this.city=city;
		
	}
	
	public void setname(T name) {
		this.name=name;
	}
	
	public void setcity(T city) {
		this.city=city;
	}
	
	
	public T getname() {
		return name;
	}
	
	public T getcity() {
		return city;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
	

}
