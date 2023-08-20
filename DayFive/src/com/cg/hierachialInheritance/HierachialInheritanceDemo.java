package com.cg.hierachialInheritance;

public class HierachialInheritanceDemo {

	public static void main(String[] args) {
		Person p1 =new Person("channabasu","male",8296495877l,"bgk");
		//p1.setCity("bgk");
		//p1.setGender("male");
		//p1.setName("channabasu");
		//p1.setPhoneno(8296495877l);
		
		System.out.println(p1);
		
		
		Person p2=new Student("channabasu","male",8296495877l,"bgk","ece",8.25f);
		Person p3=new Employee("channabasu","male",8296495877l,"bgk",29,800000,"manager");
		
		
		System.out.println(p2);
		System.out.println(p3);
		
		
		
		
		
		

	}

}
