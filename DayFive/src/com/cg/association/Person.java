package com.cg.association;

public class Person {
   private String name;
   private Address address;
   
   
   
   
   
    public Person() {
	super();
}


	public Person(String name, Address address) {
	super();
	this.name = name;
	this.address = address;
    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
   
	Address a=new Address();
	
    
	
	
	

	public void display() {
		System.out.println(name);
		System.out.println("num:"+ a.getNo()  +  "   city:" + a.getCity() +"   pincode:" +  a.getPincode()  + "   state:" +  a.getState()+"   street:"+a.getStreet());
		
	}
    
    
   
   
   
}
