package com.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AspirantMain {
	
	public Map<String,Double>aspirantMap;

	public Map<String, Double> getAspirantMap() {
		return aspirantMap;
	}

	public void setAspirantMap(Map<String, Double> aspirantMap) {
		this.aspirantMap = aspirantMap;
	}
	
	public double findAspirantMark(String rollNumber) {
		double mark;
		if(aspirantMap.containsKey(rollNumber)) {
			mark=aspirantMap.get(rollNumber);
		}
		else {
			return -1;
		}
		return mark;
	}
	
	public List<String> findAspirantSelectedForTheSuperBatch(){
		List<String> candidatelist=new ArrayList<>();
		for(Map.Entry<String, Double> entry:aspirantMap.entrySet()) {
			
			if(entry.getValue()>=80) {
				candidatelist.add(entry.getKey());
				
		}
		
		}
		return candidatelist;
	}

}
