package com.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BouquetShopMain {
	private Map<String,Integer>orderMap;

	public Map<String, Integer> getOrderMap() {
		return orderMap;
	}

	public void setOrderMap(Map<String, Integer> orderMap) {
		this.orderMap = orderMap;
	}
	
	public int findTotalCountOfBouquetsSoldBasedOnTheGivenRange(int startCount,int endCount) {
		int sum=0;
		for(int value:orderMap.values()) {
			if(value>=startCount&&value<=endCount) {
			sum=sum+value;
			}
		}
		return sum;
		
		
	}
	
	
	
	public List<String> findOrderIdsBasedOnBouquetsSold(){
		List<String> orderlist=new ArrayList<>();
       for(Map.Entry<String, Integer> entry:orderMap.entrySet()) {
    	   if(entry.getValue()>=500) {
    		   orderlist.add(entry.getKey());
    	   }
			
		}
       return orderlist;
	}

}
