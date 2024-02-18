package com.src;
import java.util.Deque;
import java.util.ArrayDeque;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<Integer> q=new ArrayDeque<>();
		for(int i=0;i<9;i++) {
			q.add(i);
		}
		System.out.println(q);
		System.out.println(q.peekLast());
		System.out.println(q.getFirst());
		System.out.println(q.getLast());
		
		

	}

}
