package com.src;
import java.util.*;

public class PlayerInfo {
	
	private Map<String,String>playerMap;

	public Map<String, String> getPlayerMap() {
		return playerMap;
	}

	public void setPlayerMap(Map<String, String> playerMap) {
		this.playerMap = playerMap;
	}
	
	public int findTotalCountOfPlayerIdsBasedOnSportsType(String sportsType) {
		int count=0;
		for(String value:playerMap.values()) {
			if(value.matches(sportsType)) {
				count++;
			}
			else {
				return -1;
			}
		}
		return count;
	}
	public List<String>findPlayerBySportsType(String sportsType){
		List<String> list=new ArrayList<>();
		for(Map.Entry<String,String> entry:playerMap.entrySet()) {
			if(entry.getValue().equalsIgnoreCase(sportsType)) {
				list.add(entry.getKey());
			}
		}
		return list;
		
	}

}
