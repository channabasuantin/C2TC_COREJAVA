package com.cg.demo;

public class employee {
	private int Id;
	private String name;
	private int income;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	@Override
	public String toString() {
		return "employee [Id=" + Id + ", name=" + name + ", income=" + income + "]";
	}
	
	
	

}
