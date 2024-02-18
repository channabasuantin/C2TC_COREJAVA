package com.src;
import java.util.*;
import java.text.*;
import java.text.SimpleDateFormat;
//import java.util.Date;

public class GreatBeginningInterface {
	public static GreatBeginnings extractDetails(String eventDetails)throws ParseException {
		String details[]=eventDetails.split(":");
		SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		Date date=null;
		try {
			date=format.parse(details[2]);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		return new GreatBeginnings(details[0],details[1],date,Double.parseDouble(details[3]));
	}
	

	public static void main(String[] args) {
		

	}

}
