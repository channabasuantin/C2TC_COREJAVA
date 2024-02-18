package com.src;
import java.util.*;

public class SteelMap {

	private Map<String,String>steelMap;

	public Map<String, String> getSteelMap() {
		return steelMap;
	}

	public void setSteelMap(Map<String, String> steelMap) {
		this.steelMap = steelMap;
	}
	
	public int findCountOfOrderIdsBasedOnTheSteelType(String steelType) {
		int count=0;
		for(String value:steelMap.values()) {
			if(value.matches(steelType)) {
				count++;	
			}else {
				return -1;
			}
		}
		return count;
	}
	
	public List<String>findOrderIdsBasedOnTheSteelType(String steelType){
		List<String> steelmaplist=new ArrayList<>();
		for(Map.Entry<String, String> entry:steelMap.entrySet()) {
			if(entry.getValue().equalsIgnoreCase(steelType)) {
				steelmaplist.add(entry.getKey());
			}
		}
		return steelmaplist;
	}
	
}
