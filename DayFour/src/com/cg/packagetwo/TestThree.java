package com.cg.packagetwo;
import com.cg.packageone.TestOne;

public class TestThree extends TestOne {
	

	public static void main(String[] args) {
		TestThree t3=new TestThree();
		t3.id=5;  //show the error not visible it is problem with access modifier
		System.out.println(t3.id);//show the error not visible it is problem with access modifier
		t3.display();

	}

}
