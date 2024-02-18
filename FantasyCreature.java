package com.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FantasyCreature {
	
	private Map<String,Integer> FantasyCreature;

	public Map<String, Integer> getFantasyCreature() {
		return FantasyCreature;
	}

	public void setFantasyCreature(Map<String, Integer> fantasyCreature) {
		FantasyCreature = fantasyCreature;
	}
	public int findTheHitPointsForTheGivenCreature(String creature) {
	   if(FantasyCreature.containsKey(creature)) {
		  return FantasyCreature.get(creature);
		   
	   }
	   else {
		   return -1;
	   }
	}
	
	public List<String> findTheCreatureNamesBasedOnTheHitpoints(){
		
		List<String> creaturelist=new ArrayList<>();
		for(Map.Entry<String,Integer> entry:FantasyCreature.entrySet()) {
			if(entry.getValue()>=80) {
				creaturelist.add(entry.getKey());
			}
		}
		return creaturelist;
	}
	
	

}
