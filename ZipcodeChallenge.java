package com.src;
import java.util.*;
public class ZipcodeChallenge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Map<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(90210,"Beverly Hills");
		hm.put(10118,"Manhattan");
		hm.put(70045,"Los Angeles");
		hm.put(11111,"Kuppan Palayam");
		hm.put(10020,"Chimmaseri");
//		 String boldCode = "\u001B[1m";
//		 String resetCode = "\u001B[0m";
		System.out.println("Enter the 5 digit zip code:");
		 int zip_code = in.nextInt();
		 
		 
		 
		if(hm.containsKey(zip_code)) {
			System.out.println(hm.get(zip_code));
			
			
		}else {
			System.out.println("Invalid zip_code:");
		}

	
	}
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		
//		 Map<Integer, String> map = new HashMap<>();
//	        map.put(, "Value1");
//	        map.put("Key2", "Value2");
//	        map.put("Key3", "Value3");
//
//	        String resetCode = "\u001B[0m";
//	        String boldCode = "\u001B[1m";
//
//	        for (Map.Entry<String, String> entry : map.entrySet()) {
//	            System.out.println(boldCode + entry.getKey() + resetCode + " : " + boldCode + entry.getValue() + resetCode);
//	        }
//	    }
//	}