package com.cg.hierachialInheritance;

public class Person {
	private String name;
	private String gender;
	private long phoneno;
	private String city;
	
	
	public Person() {
		super();
	}
	
	
	
	public Person(String name, String gender, long phoneno, String city) {
		super();
		this.name = name;
		this.gender = gender;
		this.phoneno = phoneno;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", phoneno=" + phoneno + ", city=" + city + "]";
	}
	
	
	
	
	

}
