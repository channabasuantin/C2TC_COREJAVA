package com.src;
import java.util.*;

public class TrainerMain {
	private Map<String,Float> trainerMap;

	public Map<String, Float> getTrainerMap() {
		return trainerMap;
	}

	public void setTrainerMap(Map<String, Float> trainerMap) {
		this.trainerMap = trainerMap;
	}
	public float findPerformanceRatingOfGivenTrainerId(String trainerId) {
		if(trainerMap.containsKey(trainerId)) {
			return trainerMap.get(trainerId);
		}else {
			return -1;
		}
	}
	public List<String> findTrainerIdsWithLowPerformanceRating(){
		List<String> trainerlist=new ArrayList<>();
		for(Map.Entry<String, Float> entry:trainerMap.entrySet()) {
			if(entry.getValue()<=3) {
				trainerlist.add(entry.getKey());
			}
		}
		return trainerlist;
	}

}
