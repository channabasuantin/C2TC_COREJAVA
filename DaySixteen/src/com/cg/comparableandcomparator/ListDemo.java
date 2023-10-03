package com.cg.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
public class ListDemo {

	public static void main(String[] args) {
		List<Person> personlist=new ArrayList<Person>();
		personlist.add(new Person("channabasu","ark"));
		personlist.add(new Person("sagar","bgk"));
		personlist.add(new Person("zara","mumbai"));
		personlist.add(new Person("lekha","bangalore"));
		personlist.add(new Person("darshan","delhi"));
		
		
		System.out.println(personlist);
		Collections.sort(personlist,new SortByName());
		System.out.println(personlist);
		
		Collections.sort(personlist,new SortByCity());
		
		System.out.println(personlist);
		
		
		
		List<Student> studentlist=new ArrayList<Student>();
		studentlist.add(new Student("darshan",29,82));
		studentlist.add(new Student("sagar",13,72));
		studentlist.add(new Student("channabasu",27,62));
		studentlist.add(new Student("chetan",28,89));
	
		
		
		System.out.println("before sorting:");
		System.out.println(studentlist);
		
		Collections.sort(studentlist);
		
		System.out.println("after sorting");
		System.out.println(studentlist);
		
		
	}

}
