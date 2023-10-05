package com.cg.mapinterface;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMapDemo {

	public static void main(String[] args) {
		
		ConcurrentHashMap<Integer,String> chm=new ConcurrentHashMap<>();
		chm.put(100,"Hello");
chm.put(101,"Hi");
chm.put(102, "how are you?");
chm.put(103,"my name is channabasu");
System.out.println(chm);//{100=Hello, 101=Hi, 102=how are you?, 103=my name is channabasu}

chm.putIfAbsent(104,"hello");
System.out.println(chm);//{100=Hello, 101=Hi, 102=how are you?, 103=my name is channabasu, 104=hello}
chm.remove(100,"Hello");
System.out.println(chm);//{101=Hi, 102=how are you?, 103=my name is channabasu, 104=hello}

chm.replace(101,"Hello");
System.out.println(chm);//{101=Hello, 102=how are you?, 103=my name is channabasu, 104=hello}


	}

}
