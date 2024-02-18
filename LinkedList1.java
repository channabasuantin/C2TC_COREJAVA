package com.src;
import java.util.LinkedList;
import java.util.*;
import java.util.ListIterator;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		LinkedList<Integer> ll1=new LinkedList<>(List.of(1,2,3,4,5,6));
		ll.add(2);
		ll.add(3);
		ll.addAll(ll1);
		//System.out.println(ll);
		
		ListIterator<Integer> li=ll.listIterator();
		 while(li.hasNext()) 
			System.out.println(li.next());
		 
		li=ll.listIterator(ll.size());
		 while(li.hasPrevious()) {
			 int n=li.previous();
			 System.out.println(n);
			 if(n==1) {
				 li.set(10);
              System.out.println(ll);
		 }
			
		 
		 }
			 System.out.println(ll);
		
		
		
		
		
	    
		
	}

}
