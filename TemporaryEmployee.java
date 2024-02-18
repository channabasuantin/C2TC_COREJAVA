package com.src;

public class TemporaryEmployee extends Employee {

	private int hoursWorked;
	private int hourlyWages;
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked=hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages=hourlyWages;
	}
	public TemporaryEmployee(int employeeId,String employeeName,int hoursWorked,int hourlyWages) {
		super(employeeId,employeeName);
		//this.employeeId=employeeId;
		//this.employeeName=employeeName;
		this.hourlyWages=hourlyWages;
		this.hoursWorked=hoursWorked;
	}
	public void calculateSalary() {
		double salary;
		this.salary=this.hourlyWages*this.hoursWorked;
	}
}
