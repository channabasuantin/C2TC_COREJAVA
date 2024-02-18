package com.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PlacementMain {
	Map<String,Double>appMap;

	public Map<String, Double> getAppMap() {
		return appMap;
	}

	public void setAppMap(Map<String, Double> appMap) {
		this.appMap = appMap;
	}
	
	public double findAppRating(String appName) {
		if(appMap.containsKey(appName)) {
			return appMap.get(appName);
		}
		else {
			return -1;
		}
	}
	public List<String>findAppsWithLowRating(){
		List<String> appmaplist=new ArrayList<>();
		for(Map.Entry<String, Double> entry:appMap.entrySet()) {
			
			if(entry.getValue()<=3) {
				appmaplist.add(entry.getKey());
			}
			
		}
		return appmaplist;
		
		
	}
	
	

}
