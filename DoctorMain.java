package com.src;
import java.util.*;

public class DoctorMain {
	Map<String,String>doctorDetailsMap;

	public Map<String, String> getDoctorDetailsMap() {
		return doctorDetailsMap;
	}

	public void setDoctorDetailsMap(Map<String, String> doctorDetailsMap) {
		this.doctorDetailsMap = doctorDetailsMap;
	}
	
   public String findSpecialization(String doctorId) {
	   if(doctorDetailsMap.containsKey(doctorId)) {
			return doctorDetailsMap.get(doctorId);
		}
	   else {
		   return "Invalid doctor id"; 
	   }
	   
	  
   }
   
   public List<String> findDoctorsBasedOnTheGivenSpecialization(String specialization){
	   List<String> doctorlist=new ArrayList<>();
	   for(Map.Entry<String, String> entry:doctorDetailsMap.entrySet()) {
		   if(entry.getValue().equalsIgnoreCase(specialization)) {
			   doctorlist.add(entry.getKey());
		   }
	   }
	   return doctorlist;
   }
	
	

}
