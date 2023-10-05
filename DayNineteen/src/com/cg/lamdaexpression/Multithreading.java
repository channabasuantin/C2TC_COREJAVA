package com.cg.lamdaexpression;

/*
class Eclipse implements Runnable{
	public void run() {
		System.out.println("i am in Eclipse run method");
	}
}
*/
public class Multithreading {

	public static void main(String[] args) {
		
		/*
		Eclipse e=new Eclipse();
		Thread obj=new Thread(e);
		obj.start();//i am in Eclipse run method
        */
		
		
		/*instead of writing separate class and creating object of that class in above code with the help of lamda we can write all code in one line*/
		
		new Thread(()->{System.out.println("i am in Eclipse run method");}).start();
	}

}
