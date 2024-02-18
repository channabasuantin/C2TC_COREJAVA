package com.src;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LowerBoundDemo {

	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(12);
		li.add(13);
		li.add(14);
		System.out.println(li);
		Collections <? extends Number> li1=Arrays.asList(1,2,3);
		//li1.add(1);
		//li1.add(2);
		System.out.println(li1);
		li1.addAll(li);
		/*
		 * List<String> li2=new ArrayList<>(); li2.add("channbasu");
		 * System.out.println(li2); 
		 * li2.addAll(li);
		 */
		
		

	}

}
