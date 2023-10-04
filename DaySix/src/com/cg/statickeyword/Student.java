package com.cg.statickeyword;

public class Student {
    private int id;
    private String name;
    private static String department="ece";
    private static String  batchno="b70";
    private static String collegeName="bec";
	
    
    public Student() {
    	
    }
    
    
    public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static String getDepartment() {
		return department;
	}



	public static void setDepartment(String department) {
		Student.department = department;
	}



	public static String getBatchno() {
		return batchno;
	}



	public static void setBatchno(String batchno) {
		Student.batchno = batchno;
	}



	public static String getCollegeName() {
		return collegeName;
	}



	public static void setCollegeName(String collegeName) {
		Student.collegeName = collegeName;
	}


	void display() {
		System.out.println(id+" "+name+" " +department+" "+batchno+" "+collegeName+" ");
	}



	
    
    
    
}
