package com.src;

public class EmployeeInfo {
	String employeeId;
	String employeeName;
	String jobName;
	int yearsOfExperience;
	int workedHours;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public int getWorkedHours() {
		return workedHours;
	}
	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}
	public EmployeeInfo(String employeeId, String employeeName, String jobName, int yearsOfExperience,
			int workedHours) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.jobName = jobName;
		this.yearsOfExperience = yearsOfExperience;
		this.workedHours = workedHours;
	}
	
	public double calculateSalary() {
		double basicPay=0;
		double increasedPercentage=0;
		
		switch(jobName) {
		case "VideoEditor":
			if(yearsOfExperience<=2) {
			basicPay=15;
		    increasedPercentage=0.01;
		}
		else if(yearsOfExperience<=5) {
			basicPay=15;
		    increasedPercentage=0.025;
		}
		else if(yearsOfExperience>=6) {
			basicPay=15;
		    increasedPercentage=0.04;
		}
		break;
		
		case "TeachingAssistant":if(yearsOfExperience<=2) {
			basicPay=50;
		    increasedPercentage=0.01;
		}
		else if(yearsOfExperience<=5) {
			basicPay=50;
		    increasedPercentage=0.025;
		}
		else if(yearsOfExperience>=6) {
			basicPay=50;
		    increasedPercentage=0.04;
		}
		break;
		
		case "TelecallingExecutive":if(yearsOfExperience<=2) {
			basicPay=25;
		    increasedPercentage=0.01;
		}
		else if(yearsOfExperience<=5) {
			basicPay=25;
		    increasedPercentage=0.025;
		}
		else if(yearsOfExperience>=6) {
			basicPay=25;
		    increasedPercentage=0.04;
		}
		break;
		
		case "GraphicDesigner":if(yearsOfExperience<=2) {
			basicPay=60;
		    increasedPercentage=0.01;
		}
		else if(yearsOfExperience<=5) {
			basicPay=60;
		    increasedPercentage=0.025;
		}
		else if(yearsOfExperience>=6) {
			basicPay=60;
		    increasedPercentage=0.04;
		}
		break;
		default:return 0;
		
		
	}
		if(yearsOfExperience<=0 && workedHours<=0) {
			return 0;
		}
		return (workedHours*basicPay)+(workedHours*basicPay*increasedPercentage);
	}
	
	
	
	
}
