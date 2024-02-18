package com.src;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("a", 97);
		hm.put("b",98);
		hm.put("c", 99);
		hm.put("d", 100);
		System.out.println("Enter the value");
		hm.remove("a");
		System.out.println(hm);
		hm.putIfAbsent("a",97);
		System.out.println(hm);
		System.out.println(hm.isEmpty());
		hm.replace("a",97, 101);
		System.out.println(hm);
	   hm.replace("a", 108);
	   System.out.println(hm);
		String charcter=sc.nextLine();
//		if(hm.containsKey(charcter)) {
//			System.out.println(hm.get(charcter));
//		}
//		
//		for(Map.Entry<String,Integer> me:hm.entrySet()) {
//			System.out.println(me);
//		}
		if(hm.containsKey(charcter)) {
			System.out.println(hm.get(charcter));
		}
		else {
		System.out.println("Enter the correct value");
		}

	}

}
