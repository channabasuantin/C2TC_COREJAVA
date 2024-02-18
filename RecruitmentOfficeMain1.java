package com.src;
import java.util.*;

public class RecruitmentOfficeMain1 {

	private Map<String,String>recruitmentMap;

	public Map<String, String> getRecruitmentMap() {
		return recruitmentMap;
	}

	public void setRecruitmentMap(Map<String, String> recruitmentMap) {
		this.recruitmentMap = recruitmentMap;
	}
	
	public int findCountOfRecruitmentBasedOnTheOfficeName(String officeName) {
		int count=0;
		for(String value:recruitmentMap.values()) {
			if(value.matches(officeName)) {
				count++;
			}else {
				return -1;
			}
		}
		return count;
	}
	
	public List<String>findRecruitmentIdsBasedOnTheOfficeName(String officeName){
		List<String> list=new ArrayList<>();
		for(Map.Entry<String, String> entry:recruitmentMap.entrySet()) {
			if(entry.getValue().equalsIgnoreCase(officeName)) {
				list.add(entry.getKey());
				
			}
		}
		return list;
	}
}
