package com.cg.association;

public class Executor {

	public static void main(String[] args) {
		Address a=new Address();
		//Person p=new Person("name",a);
		//OR//
		
		Person p= new Person("CHANNABASU",new Address(1,"XYZ","BAGALKOT",587116,"KARNATAKA"));
		
		    a.setNo(1);
	        a.setCity("bgk");
	        a.setPincode(587116);
	        a.setState("kar");
	        a.setStreet("fkfk");
	        
	        
      
        
        p.display();
        //System.out.println(a);
        
	}

}
