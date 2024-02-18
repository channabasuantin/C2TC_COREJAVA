package com.src;
import java.util.*;


public class ClientInfo {
	private Map<String,String> clientMap;

	public Map<String, String> getClientMap() {
		return clientMap;
	}

	public void setClientMap(Map<String, String> clientMap) {
		this.clientMap = clientMap;
	}
	
	public int findTotalCountOfClientsBasedOnPackageName(String packageName) {
		int count=0;
		for(String value:clientMap.values()) {
			if(packageName.matches(value)) {
				count++;	
			}
			else {
				return -1;
			}
		}
		return count;
	}
	
	public List<String> searchClientIdsByPackageName(String packageName){
		List<String> clientlist=new ArrayList<>();
		for(Map.Entry<String, String> entry:clientMap.entrySet()) {
			if(entry.getValue().equalsIgnoreCase(packageName)) {
				clientlist.add(entry.getKey());
			}
		}
		//return clientlist;
		return clientlist;
		
	}
	

}
