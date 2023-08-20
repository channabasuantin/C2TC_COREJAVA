package com.cg.singleinheritance;

public class Student extends Citizen{
	private int id;
	private String collegeName;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", collegeName=" + collegeName + ", getName()=" + getName() + ", getDateOfBirth()="
				+ getDateOfBirth() + ", getAddress()=" + getAddress() + ", getAadharNo()=" + getAadharNo()
				+ ", getPhoneNo()=" + getPhoneNo() + "]";
	}
	
	
	
	
	
	

}
