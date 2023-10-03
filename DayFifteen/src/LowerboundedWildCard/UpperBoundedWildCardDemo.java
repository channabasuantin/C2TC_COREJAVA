package LowerboundedWildCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.cg.generics.UpperBoundedWildCard;

public class UpperBoundedWildCardDemo {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>intlist=new ArrayList<>();
	    UpperBoundedWildCard.sumoflist(intlist);
		
		ArrayList<Float>Floatlist=new ArrayList<>();
		  UpperBoundedWildCard.sumoflist(Floatlist);
		
		ArrayList<Double>doublelist=new ArrayList<>();
		  UpperBoundedWildCard.sumoflist(doublelist);
		
		
		
		
	}

}
