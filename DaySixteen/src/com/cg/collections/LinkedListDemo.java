package com.cg.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<>();
		
		
		list.add(10);
		list.add(20);
		list.add(40);
		list.addFirst(5);
		list.add(2, 60);
		list.addLast(25);
		list.add(35);
		
		System.out.println(list);
		
		
		System.out.println("first element is: "+list.getFirst());
		
		System.out.println("last element is: "+list.getLast());
		
		list.removeFirst();
		
		list.removeLast();
		
		
		System.out.println("Number list after removing the first and last elements: "+list);
		
		
		
		ListIterator<Integer> li=list.listIterator();
		while(li.hasNext()) 
			System.out.println(li.next()+"\t");
			System.out.println();
		
		
		li=list.listIterator(list.size());
		while(li.hasPrevious()) {
			int n=li.previous();
			System.out.println(n +"\t");
			if(n==20)
				li.add(999999);
			if(n==60)
				li.set(5555);
		}
		System.out.println();
		System.out.println(list);
		
		

	}
	

}
