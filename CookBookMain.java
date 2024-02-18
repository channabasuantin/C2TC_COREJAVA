package com.src;

import java.util.List;
import java.util.Map;
import java.util.*;

public class CookBookMain {
	private Map<String,Integer> recipeMap;

	public Map<String, Integer> getRecipeMap() {
		return recipeMap;
	}

	public void setRecipeMap(Map<String, Integer> recipeMap) {
		this.recipeMap = recipeMap;
	}
	
	public int countRecipesUnderTime(int preparationTime) {
		int count=0;
		if(preparationTime<=0) {
			return -1;
		}
		for(Integer prep : recipeMap.values()) {
			if(prep == preparationTime) {
				
				count++;
			}
		}	
		return count;
	}
	public List<String>getRecipesUnderTime(int preparationTime){
		List<String> receipelist =new ArrayList<>();
		for(Map.Entry<String, Integer> entry:recipeMap.entrySet()) {
			
			if(entry.getValue()<=preparationTime) {
				receipelist.add(entry.getKey());
			}
		}
		return receipelist;
	}
	
	
	

}
