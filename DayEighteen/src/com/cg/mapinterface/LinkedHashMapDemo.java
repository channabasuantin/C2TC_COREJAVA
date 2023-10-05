package com.cg.mapinterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String,String> lhm=new LinkedHashMap();
		lhm.put("Let us c", "dennis roddy");
		lhm.put(null, "bakshi");
		lhm.put("the complete reference of java", null);
		lhm.put("full stack developer","abhdul kalam");
		lhm.put(null, null);
		
		System.out.println(lhm);
	}

}
