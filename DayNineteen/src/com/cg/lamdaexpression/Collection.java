package com.cg.lamdaexpression;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println(al);
		
		/*
		 * Iterator a=al.iterator(); while(a.hasNext()) { System.out.println(a.next());
		 * }
		 */

		/*iteration with ForEach loop*/ 
		for(Object a: al) {
			System.out.println(a);
			
		}
		/*output:1
                 2
                 3
                 4
        */
		
		
		/*using lamdaExpression*/
		
		al.forEach(a->System.out.println(a));
		
		/*output:1
		         2
		         3
		         4
		 */
	}

}
