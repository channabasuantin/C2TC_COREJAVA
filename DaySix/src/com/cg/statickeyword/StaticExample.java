package com.cg.statickeyword;




public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  StaticMethod sm=new StaticMethod();
  sm.nonStaticMethodAction();
  StaticMethod.staticmethodAction();
  Student s=new Student(1,"channabasu");
  Student.setCollegeName("BEC");
  System.out.println(Student.getCollegeName());
 Student.setBatchno("b70");
 System.out.println( Student.getBatchno());
  Student.setDepartment("ECE");
  System.out.println(Student.getDepartment());
  System.out.println(s.getName());
  
  
  
  
  
  Student s1=new Student(2,"vikas");
  s1.setId(2);
  s1.setBatchno("b71");
  s1.setCollegeName("BEC_ECE");
  s1.setDepartment("EEE");
  System.out.println(s1.getName());
  System.out.println(s1.getBatchno());
  System.out.println(s1.getCollegeName());
  System.out.println(s1.getDepartment());

 
  
	}

}
