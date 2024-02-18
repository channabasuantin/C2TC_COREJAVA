package com.src;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[]args) {
		ArrayList<Integer> a1=new ArrayList<>();
		for(int i=0;i<10;i++) {
			a1.add(i);
		}
		System.out.println(a1);
		Iterator<Integer> itr=a1.iterator();
		
		while(itr.hasNext()) {
			int i=itr.next();
			if(i%2==0) {
				itr.remove();
			}
			
		}
		System.out.println(a1);
	}
}
