package com.cg.generics;

public class GenericInterfaceDemo {

	public static void main(String[] args) {
		
		Integer arr[]= {1,2,3,4};
		MinMaxImpl<Integer> obj=new MinMaxImpl<Integer>(arr);
		System.out.println("minimum number,["+obj.min()+"]");
        System.out.println("maximum number,["+obj.max()+"]");

        Float arrOne[]= {10.f,20.2f,30.4f,42.2f};
		MinMaxImpl<Float> objOne=new MinMaxImpl<Float>(arrOne);
		System.out.println("minimum number,["+objOne.min()+"]");
        System.out.println("maximum number,["+objOne.max()+"]");
        
        PersonInterface arrTwo[]=new PersonInterface[] {new PersonInterface("channabasu","bagalkot"),new PersonInterface("ankit","bilagi"),new PersonInterface("akul","raichur")};
        MinMaxImpl<PersonInterface> objtwo=new MinMaxImpl<PersonInterface>(arrTwo);
        System.out.println("minimum number,["+objtwo.min()+"]");
        System.out.println("maximum number,["+objtwo.max()+"]");
	}

}
