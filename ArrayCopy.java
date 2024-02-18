package com.src;

public class ArrayCopy {

	public static void main(String[] args) {

		 int A[]={8,6,10,9,2};
	        
	        System.out.println("Length of A="+A.length);
	        
	        int B[]=new int[5];
	        for(int x:B) {
		    	  System.out.println(x);
		      }
	      
	        for(int i=0;i<A.length;i++)
	        {
	        	
	        	B[i]=A[i];
	           
	        }
	      for(int x:B) {
	    	  System.out.println(x);
	      }
	        
	}

}
