package com.cg.generics;

public class PersonInterface implements Comparable<PersonInterface> {

	private String name;
	private String city;
	
	PersonInterface(String name,String city){
		super();
		this.name=name;
		this.city=city;
		
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	
	public String getcity() {
		return city;
	}
	
	public void setcity(String city) {
		this.city=city;
	}
	
	
	@Override
	public int compareTo(PersonInterface o) {
		return this.name.compareTo(o.name);
	}
	
	
	public String toString() {
		return "person [name :"+name+","+"city :"  +city+"]";
		
	}
	
	

}
