package com.src;
import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<6;i++) {
			q.add(i);
		}
		System.out.println(q);
		q.remove();
		System.out.println(q);
		System.out.println(q.peek());
       System.out.println( q.poll());
       System.out.println(q);
       System.out.println(q.size());
        
	}

}
