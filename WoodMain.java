package com.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WoodMain {
	private Map<String,String>woodMap;
	
	

	public Map<String, String> getWoodMap() {
		return woodMap;
	}



	public void setWoodMap(Map<String, String> woodMap) {
		this.woodMap = woodMap;
	}



	public int findCountOfOrderIdsBasedOnTheWoodType(String woodType) {
		int count=0;
		for(String value:woodMap.values()) {
			if(value.matches(woodType)) {
				count++;
			}
			else {
				return -1;
			}
			
		}
		return count;
	}
	
	
	public List<String> findOrderIdsBasedOnTheWoodType(String woodType){
		List<String> woodmaplist=new ArrayList<>();
		for(Map.Entry<String, String> entry:woodMap.entrySet()) {
			if(entry.getValue().equalsIgnoreCase(woodType)) {
				woodmaplist.add(entry.getKey());
			}
		}
		return woodmaplist;
		
	}
	
}
