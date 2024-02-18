package com.src;
import java.util.*;

public class TrekkingDetailsMain {
	private Map<String,Integer>detailsMap;

	public Map<String, Integer> getDetailsMap() {
		return detailsMap;
	}

	public void setDetailsMap(Map<String, Integer> detailsMap) {
		this.detailsMap = detailsMap;
	}
	
	public int findCountOfMountainsBasedOnThePeakPoint(int minimumPeak,int maximumPeak) {
		int count=0;
		for(int value:detailsMap.values()) {
			if(value>=minimumPeak && value<=maximumPeak) {
				count++;
			}else {
				return -1;
			}
			
		}
		return count;
	}
	
	public List<String>findMountainsBasedOnPeakPoint(int peakPoint){
		List<String> detailslist=new ArrayList<>();
		for(Map.Entry<String, Integer> entry:detailsMap.entrySet()) {
			if(entry.getValue().equals(peakPoint)){
				detailslist.add(entry.getKey());
			}
		}
		return detailslist;
	}
	

}
