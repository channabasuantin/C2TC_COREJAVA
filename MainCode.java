package com.src;

import java.util.ArrayList;

public class MainCode {
//    public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> al){
//    	ArrayList<Integer> result=new ArrayList<>();
//    	for(int i=0;i<al.size();i++) {
//    		if((i+1)%3!=0) {
//    			result.add(al.get(i));
//    		}
//    	}
//    	return result;
//    }
	
	
	
	
	public static int revereseNumber(int number) {
		
		int reversed=0;
		while(number!=0) {
			int digit=number%10;
			 reversed=reversed+digit;
			number= number/10;
		}
		return number;
	}
}
