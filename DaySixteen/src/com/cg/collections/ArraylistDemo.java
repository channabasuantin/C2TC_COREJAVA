package com.cg.collections;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		List listOne=new ArrayList<>();
		System.out.println(listOne.size());  //0
		
		listOne.add(10);
		listOne.add(20);
		listOne.add(30);
		listOne.add(40.44);
		listOne.add("Hello");
		listOne.add(true);
		listOne.add(2, "channabasu");
		System.out.println(listOne.size());//7
		
		
		
		
		
		System.out.println(listOne.contains(10));//true
		
		System.out.println(listOne);//[10, 20, channabasu, 30, 40.44, Hello, true]
		
		List listTwo=new ArrayList<>();
		listTwo.add(10);
		listTwo.add(20);
		listTwo.add("Hello");
		
		
		listOne.removeAll(listTwo);
		
		System.out.println(listOne);
		
		
		listOne.clear();
		
		
		System.out.println(listOne);
		
		
		

		
		
		

	}

}
