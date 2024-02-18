package com.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class BatteryMain {
	
	private Map<String,Integer> batteryNameMap;

	public Map<String, Integer> getBatteryNameMap() {
		return batteryNameMap;
	}

	public void setBatteryNameMap(Map<String, Integer> batteryNameMap) {
		this.batteryNameMap = batteryNameMap;
	}
	
	public float findWattPowerBasedOnBatteryName(String batteryName) {
		
		if(batteryNameMap.containsKey(batteryName)) {
			return batteryNameMap.get(batteryName);
		}
		else {
			return -1;
		}
	}
	public List<String> findHighestWattBatteries(){
		List<String> batterylist=new ArrayList<>();
		Integer max = Collections.max(batteryNameMap.values());
		
		for(Map.Entry<String, Integer> entry:batteryNameMap.entrySet()) {
		  String e = entry.getKey();
		  Integer m = entry.getValue();
		  if(m==max) {
			  batterylist.add(e);
			  
		  }
		  
		}
		return batterylist;
	}
	

}
