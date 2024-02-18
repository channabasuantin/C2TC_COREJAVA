package com.src;

public class RationCard {
	String rationCardId;
	String holderName;
	String cardColour;
	double quantity;
	double price;
	public String getRationCardId() {
		return rationCardId;
	}
	public void setRationCardId(String rationCardId) {
		this.rationCardId = rationCardId;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getCardColour() {
		return cardColour;
	}
	public void setCardColour(String cardColour) {
		this.cardColour = cardColour;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public RationCard(String rationCardId, String holderName, String cardColour, double quantity, double price) {
		super();
		this.rationCardId = rationCardId;
		this.holderName = holderName;
		this.cardColour = cardColour;
		this.quantity = quantity;
		this.price = price;
	}
	
	public double calculateBillAmount() {
		if(quantity<=0) {
			return -1;
		}
		double discount;
		switch("cardColour") {
		case "Pink":discount=20;
		break;
		case "Blue":discount=9;
		break;
		case "Yellow":discount=15;
		break;
		default:return -1;
		
		}
		return quantity*(price-(price*discount)/100);
	}
	

}
