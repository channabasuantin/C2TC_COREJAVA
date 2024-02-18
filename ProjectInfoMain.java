package com.src;
import java.util.*;

public class ProjectInfoMain {
	private Map<String,String>projectMap;

	public Map<String, String> getProjectMap() {
		return projectMap;
	}

	public void setProjectMap(Map<String, String> projectMap) {
		this.projectMap = projectMap;
	}
	
	public int findTheCountOfProjectsBasedOnTheConstructionType(String constructionType) {
		int count=0;
		for(String value:projectMap.values()) {
			if(value.matches(constructionType)) {
				count++;
			}
		}
		return count==0 ? -1 : count;
	}
	public List<String> findProjectIdsBasedOnTheConstructionType(String constructionType){
		List<String> projectMaplist=new ArrayList<>();
		for(Map.Entry<String, String> entry:projectMap.entrySet()) {
			if(entry.getValue().equalsIgnoreCase(constructionType)) {
				projectMaplist.add(entry.getValue());
			}
		}
		return projectMaplist;
	}
	

}
