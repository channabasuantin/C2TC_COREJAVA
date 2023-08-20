package com.cg.hierachialInheritance;

public class Employee extends Person{
	
	private int empId;
	private float salary;
	private String designation;
	
	
	
	
	public Employee() {
		super();
	}


	public Employee(String name, String gender, long phoneno, String city, int empId, float salary,
			String designation) {
		super(name, gender, phoneno, city);
		this.empId = empId;
		this.salary = salary;
		this.designation = designation;
		}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", designation=" + designation + ", getName()="
				+ getName() + ", getGender()=" + getGender() + ", getPhoneno()=" + getPhoneno() + ", getCity()="
				+ getCity() + "]";
	}
	
	
	
	
	
	
	

}
