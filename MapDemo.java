package com.src;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<String,Integer>();
		m.put("a",new Integer(100));
		m.put("b", new Integer(200));
		m.put("c",new Integer(300));
		m.put("d",new Integer(400));
		System.out.println(m);
		for(Map.Entry<String,Integer> me:m.entrySet()) {
			
			System.out.println(me.getKey());
			System.out.println(me.getValue());
			
		}
		
	}

}
