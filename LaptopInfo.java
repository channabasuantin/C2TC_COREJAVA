package com.src;

public class LaptopInfo {
	String laptopId;
	String modelName;
	String brandName;
	double cost;
	public String getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(String laptopId) {
		this.laptopId = laptopId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public LaptopInfo(String laptopId, String modelName, String brandName, double cost) {
		super();
		this.laptopId = laptopId;
		this.modelName = modelName;
		this.brandName = brandName;
		this.cost = cost;
	}
	
	public double calculateLaptopCost() {
		double discount=0;
		switch(brandName) {
		case "Apple":discount=5;
		break;
		case "Dell":discount=10;
		break;
		case "Samsung":discount=15;
		break;
		
		case "Lenovo":discount=20;
		break;
		default: return -1;
		
		
		}
		if(cost<=0) {
			return -1;
		}
		return cost-((cost*discount)/100);
	}
	
	

}
