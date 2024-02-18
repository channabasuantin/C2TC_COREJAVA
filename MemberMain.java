package com.src;
import java.util.*;


public class MemberMain {
	Map<String,String>memberMap;

	public Map<String, String> getMemberMap() {
		return memberMap;
	}

	public void setMemberMap(Map<String, String> memberMap) {
		this.memberMap = memberMap;
	}
	
	public String findeMemberTypeOfGivenMemberId(String memberId) {
		if(memberMap.containsKey(memberId)) {
			return memberMap.get(memberId);
		}
		else {
			return "Invalid member id";
		}
	}
	
	public List<String>findMemberIdsBasedOnTheMemberType(String memberType){
		List<String> memberlist=new ArrayList<>();
		for(Map.Entry<String, String> entry:memberMap.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			if(val.equalsIgnoreCase(memberType)) {
				memberlist.add(key);
			}
			
			  
		}
		return memberlist;
	}

}
