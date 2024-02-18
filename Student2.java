package com.src;

public class Student2 {

	private int rollno;
   private String name;

   
  








public Student2(int rollno, String name) {
	super();
	this.rollno = rollno;
	this.name = name;
}


public int getRollno() {
	return rollno;
}


public void setRollno(int rollno) {
	this.rollno = rollno;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


@Override
public String toString() {
	return "Student2 [rollno=" + rollno + ", name=" + name + "]";
}



   
}
