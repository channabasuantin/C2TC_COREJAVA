package com.cg.mapinterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<String,Integer> m=new HashMap();
		
	           //(key,value)	//key should be unique and it cannot be duplicate
		m.put("Let us c", 350);
		m.put("the complete reference of c++", 450);
		m.put("the complete reference of java", 550);
		m.put("full stack developer", 650);
		
		
		//System.out.println(m);//it is in pair of curly brace   //output:{the complete reference of c++=450, the complete reference of java=550, full stack developer=650, Let us c=350}
		Set set=m.entrySet();
		Iterator i=set.iterator();
		while(i.hasNext()) {
			
			Map.Entry me=(Map.Entry)i.next();	
			//System.out.println(me);
			System.out.println(me.getKey());
			System.out.println(me.getValue());
			//System.out.println(i.next());
			
			
		}
			

			Map<String,String> mOne=new HashMap();
			
		           
			mOne.put("nitin","nitin@gmail.com" );
			mOne.put("jahir", "jahirkhan");
			mOne.put(null, "virendra@gmail.com");
			mOne.put("full stack developer",null);
			mOne.put(null,null);
			
			System.out.println(mOne);
			
			
			
			//In map also we can create generic type as a userdefined			
			Map<String,Student> mTwo=new HashMap();
			
	        mTwo.put("nitin",new Student("channabasu",12,78) );
			mTwo.put("jahir",new Student("chetan",28,87));
			mTwo.put(null,new Student("darshan",29,98));
			mTwo.put("full stack developer",new Student("iranna",31,99));
		
			
			System.out.println(mTwo);
			
		}
		
	}


