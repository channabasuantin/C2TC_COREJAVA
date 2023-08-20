package com.cg.singleinheritance;

public class Citizen {
   private String name;
   private String dateOfBirth;
   private String address;
   private String aadharNo;
   private long phoneNo;
   
   
   
   
public Citizen() {
	System.out.println("citizen object is created");
}


public Citizen(String name, String dateOfBirth, String address, String aadharNo, long phoneNo) {
	super();
	this.name = name;
	this.dateOfBirth = dateOfBirth;
	this.address = address;
	this.aadharNo = aadharNo;
	this.phoneNo = phoneNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAadharNo() {
	return aadharNo;
}
public void setAadharNo(String aadharNo) {
	this.aadharNo = aadharNo;
}
public long getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(long phoneNo) {
	this.phoneNo = phoneNo;
}


@Override
public String toString() {
	return "Citizen [name=" + name + ", dateOfBirth=" + dateOfBirth + ", address=" + address + ", aadharNo=" + aadharNo
			+ ", phoneNo=" + phoneNo + "]";
}
   
   
   
   
   
   
}
