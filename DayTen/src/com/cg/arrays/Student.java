package com.cg.arrays;

public class Student {
	
		private String name;
		private int rollNumber;
		private String collegeName;
		private int collegeCode;
		public void setValue(String name,int rollNumber,String collegeName,int collegeCode) {
			this.name=name;
			this.rollNumber=rollNumber;
			this.collegeName=collegeName;
			this.collegeCode=collegeCode;
		}
	    public void getValue() {
	    	System.out.println(name);
	    	System.out.println(rollNumber);
	    	System.out.println(collegeName);
	    	System.out.println(collegeCode);
	    }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollNumber() {
			return rollNumber;
		}
		public void setRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
		}
		public String getCollegeName() {
			return collegeName;
		}
		public void setCollegeName(String collegeName) {
			this.collegeName = collegeName;
		}
		public int getCollegeCode() {
			return collegeCode;
		}
		public void setCollegeCode(int collegeCode) {
			this.collegeCode = collegeCode;
		}
	}

