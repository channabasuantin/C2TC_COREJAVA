package com.src;

public class ProductInfo {

	private String name;
	private String upc;
	private double price;
	private int Quantity;
	
	
	ProductInfo(String name,String upc,double price,int Quantity){
		super();
		this.name=name;
		this.upc=upc;
		this.price=price;
		this.Quantity=Quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getUpc() {
		return upc;
	}
	public void setUpc(String upc) {
		this.upc=upc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int Quantity) {
		this.Quantity=Quantity;
	}
	
	public String toString() {
		return "productInfo[name:"+name+" upc:"+upc+" price:"+price+" Quantity:"+Quantity+"]";
	}
}
