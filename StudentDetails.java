package com.src;

public class StudentDetails {
	private int studentId;
    private String studentName;
    private String studentAddress;
    private String collegeName;
    
   
    public int getStudentId() {
    	return studentId;
    }
    
    public String getStudentName() {
    	return studentName;
    }
  
    public String getStudentAddress() {
    	return studentAddress;
    }
    public String getCollegeName() {
    	return collegeName;
    }
    
   public StudentDetails(int studentId,String studentName,String studentAddress,String collegeName) {
	  
	   this.studentId=studentId;
	   this.studentName=studentName;
	   this.studentAddress=studentAddress;
	   this.collegeName=collegeName;
	   
   }
   public StudentDetails(int studentId,String studentName,String studentAddress) {
	   
	   this.studentId=studentId;
	   this.studentName=studentName;
	   this.studentAddress=studentAddress;
	   this.collegeName="NIT";
	   
   }
public String toString() {
	return "student_id"+studentId +" student_name:" +studentName+" "+"StudentAddress:"+" "+studentAddress+" "+"collegeName:"+collegeName;
}
   
}
