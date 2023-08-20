
//when we use private(use private keyword infront of datatypes) access modifier testone execute without error  rest all are facing not visible error
//when we use default(remove the private keyword) access modifier testone and testtwo execute without error  rest all are facing not visible error
//when we use protected(use private keyword infront of datatypes) access modifier testone,testtwo,testthree execute without error  testfour facing not visible error
//when we use public keyword then it will show any error
package com.cg.packageone;

public class TestOne {
	private int id;
	private void display() {
		System.out.println("access modifiers");
	}

	public static void main(String[] args) {
		TestOne t1=new TestOne();
		t1.id=5;
		System.out.println(t1.id);
		t1.display();
		

	}

}
