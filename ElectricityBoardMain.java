package com.src;
import java.util.*;

public class ElectricityBoardMain {
	
	private Map<String,String> electricityMap;

	public Map<String, String> getElectricityMap() {
		return electricityMap;
	}

	public void setElectricityMap(Map<String, String> electricityMap) {
		this.electricityMap = electricityMap;
	}
	
	public int findCountOfConnectionBasedOnTheConnectionType(String connectionType) {
		int count=0;
		for(String val:electricityMap.values()) {
			if(val.matches(connectionType)) {
				count++;
			}
			else {
				return -1;
			}
		}
		return count;
	}
	
	public List<String> findConnectionBasedOnTheConnectionType(String connectionType){
		List<String> electricitylist=new ArrayList<>();
		for(Map.Entry<String, String> entry:electricityMap.entrySet()) {
			if(entry.getValue().equalsIgnoreCase(connectionType)){
				electricitylist.add(entry.getKey());
			}
		}
		return electricitylist;
	}
	

}
