package com.src;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
public class DateDemo {

	@SuppressWarnings({ "deprecation", "static-access" })
	public static void main(String[] args) {
		Date d=new Date();
		d.setHours(21);
		System.out.println(d);
		
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		System.out.println(ld.isLeapYear());
		GregorianCalendar gc=new GregorianCalendar();
		System.out.println(gc.getTimeInMillis());
		System.out.println(gc.getTime());
		System.out.println(gc.DATE);
		System.out.println(gc.MONTH);
		System.out.println(gc.YEAR);
		System.out.println(gc.getTimeZone());
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));
		System.out.println(ld.parse("2023-02-01"));
		LocalDate d1=LocalDate.parse("2020-01-03");
		LocalDate d2=d1.minusDays(4);
		System.out.println(d2);
		
		LocalTime t=LocalTime.now();
		System.out.println(t);
		LocalTime t1=t.minusHours(4);
		System.out.println(t1);
		
		OffsetDateTime odt=OffsetDateTime.now();
		System.out.println(odt.getDayOfMonth());
		
		OffsetDateTime odt1=OffsetDateTime.now();
		System.out.println(odt1.getDayOfMonth());
		ZonedDateTime zdt=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
				System.out.println(zdt);
				
	  Period p=Period.of(2, 2, 10);
	  System.out.println(p.addTo(LocalDate.now()));
		
		
	}

}
