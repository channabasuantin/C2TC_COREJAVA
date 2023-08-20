package com.cg.hierachialInheritance;

public class Student extends Person {
	private String department="ece";
	private float cgpa=8.25f;
	
	
	
	
	public Student() {
		super();
	}
	public Student(String name, String gender, long phoneno, String city, String department, float cgpa) {
		super(name, gender, phoneno, city);
		this.department = department;
		this.cgpa = cgpa;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Student [department=" + department + ", cgpa=" + cgpa + ", getName()=" + getName() + ", getGender()="
				+ getGender() + ", getPhoneno()=" + getPhoneno() + ", getCity()=" + getCity() + "]";
	}
	
	
	
	

}
