package com.cg.mapinterface;

import java.util.Hashtable;
import java.util.Map;


//hash table does not allow the null input and if we give it shows null pointer excetion

public class HashTableDemo {

	public static void main(String[] args) {
		Map<String,String> ht=new Hashtable<>();
		ht.put("nitin","nitin@gmail.com" );
		ht.put("jahir", "jahirkhan");
       System.out.println(ht);//{jahir=jahirkhan, nitin=nitin@gmail.com}
	}

}
