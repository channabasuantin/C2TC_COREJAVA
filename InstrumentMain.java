package com.src;

import java.util.List;
import java.util.*;

public class InstrumentMain {
	Map<String,String> instrumentMap;

	public Map<String, String> getInstrumentMap() {
		return instrumentMap;
	}

	public void setInstrumentMap(Map<String, String> instrumentMap) {
		this.instrumentMap = instrumentMap;
	}
	
	public String findInstrumentTypeForInstrumentId(String instrumentId) {
		if(instrumentMap.containsKey(instrumentId)) {
			return instrumentMap.get(instrumentId);
		}
		else {
			return "Invalid Id";
		}
	}
	public List<String>findInstrumentIdForInstrumentType(String instruemntType){
		List<String> instrumentlist=new ArrayList<>();
	for(Map.Entry<String, String> entry:instrumentMap.entrySet()) {
		
			String id = entry.getKey();
			String type = entry.getValue();
			if(type.equals(instruemntType)) {
				instrumentlist.add(id);
			}
	}
	return instrumentlist;
	}
	

}
