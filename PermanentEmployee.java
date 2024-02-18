package com.src;

public class PermanentEmployee extends Employee {

	private double basicPay;
	
	public double getBasicpay() {
		return basicPay;
	}
	public void setBasicpay(double basicPay) {
		this.basicPay=basicPay;
	}
	
	public PermanentEmployee(int employeeId,String employeeName,double basicPay) {
		super(employeeId,employeeName);
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.basicPay=basicPay;
		
	}
	public void calculateSalary() {
		double salary;
		this.salary=this.basicPay-(this.basicPay*0.12);
	}
	
}
