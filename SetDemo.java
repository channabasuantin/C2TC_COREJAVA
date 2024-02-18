package com.src;
import java.util.Set;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		
		System.out.println(s);
	    System.out.println(	s.size());
	    s.add(1);
	    s.add(2);
	    s.add(10);
	    s.add(20);
	   s.add(40);
	    System.out.println(s);
	    
	    Set<Integer> s1=new HashSet<>();
	    s1.add(200);
	    s1.add(400);
	    s1.add(500);
	    s1.add(1);
	    s.addAll(s1);
	    System.out.println(s);
	    s.removeAll(s1);
	    System.out.println(s);
	   System.out.println( s.contains(2));
	   System.out.println(s.isEmpty());
		System.out.println(s.size());
	}

}
