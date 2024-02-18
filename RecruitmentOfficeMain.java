package com.src;
import java.util.*;

public class RecruitmentOfficeMain {

	private Map<String,String>recruitmentMap;

	public Map<String, String> getRecruitmentMap() {
		return recruitmentMap;
	}

	public void setRecruitmentMap(Map<String, String> recruitmentMap) {
		this.recruitmentMap = recruitmentMap;
	}
	
	public int findCountOfRecruitmentsBasedOnTheOfficeName(String officeName) {
		int count=0;
		for(String value:recruitmentMap.values()) {
			if(value.matches(officeName)) {
				count++;
			}
		}
		return count==0 ? -1:count;
	}
	
	public List<String> findRecruitmentBasedOnTheOfficeName(String officeName){
		List<String> list=new ArrayList<>();
		
		for(String id:recruitmentMap.keySet())
		{
			if(recruitmentMap.get(id).equalsIgnoreCase(officeName))
			{
				list.add(id);
			}
		}
		
//		for(Map<String,String> entry:recruitmentMap.entrySet()){
//			if(entry.getValue().equalsIgnoreCase(officeName)) {
//				list.add(entry.getKey());
//			}
//		}
		return list;
	}
	
}
