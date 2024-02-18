package com.src;

public class MultiplyMatrix {

	public static void main(String[] args) {
		int a[][]= {{3,5,9},{7,6,2},{4,3,5}};
		int b[][]= {{1,0,0},{0,1,0},{0,0,1}};
		int c[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int k=0;k<3;k++) {
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
					
				}
				
			}
		}
		for(int x[]:c){
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
