package com.src;
//import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;
import java.util.List;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<String> q=new PriorityQueue<>();
		PriorityQueue<String> q1=new PriorityQueue<>(List.of("grapees","banana","apple"));
		q.add("channabasu");
		q.add("ram");
		q.add("shyam");
		q.add("grapes");
		
		System.out.println(q);
		
		Iterator<String> i=q.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println(q.size());
		q.addAll(q1);
		System.out.println(q);
		q.removeAll(q1);
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
       System.out.println(q);

	}

}
