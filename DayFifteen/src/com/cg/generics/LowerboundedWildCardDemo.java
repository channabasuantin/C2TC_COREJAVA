package com.cg.generics;
import java.util.Arrays;
import java.util.List;

public class LowerboundedWildCardDemo {

	public static void main(String[] args) {
		List<Integer>intlist=Arrays.asList(1,2,3,4);
		LowerboundedWildCard.displayNumber(intlist);
		
		
		List<Number>numlist=Arrays.asList(1.0,2.0,3.0,4.0);
		LowerboundedWildCard.displayNumber(numlist);
		
		
		List<Float>floatlist=Arrays.asList(1.0f,22.0f,3.0f,4.0f);
		LowerboundedWildCard.displayNumber(floatlist);

		List<Double>doublelist=Arrays.asList(1.0,22.0,3.0,4.0);
		LowerboundedWildCard.displayNumber(doublelist);
	}

}
