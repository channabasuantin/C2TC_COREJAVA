package com.src;

public interface LamdaDemo {
	public void display();

	public static void main(String[] args) {
		LamdaDemo ld = ()->{System.out.println("hello");};
		ld.display();
	}

}
