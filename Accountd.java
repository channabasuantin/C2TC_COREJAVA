package com.src;

public class Accountd {
private int accountId;
private String accountType;
private int balance;

public void setAccountId(int accountId) {
	this.accountId=accountId;
}
public int getAccountId() {
	return accountId;
}
public void setAccountType(String accountType) {
	this.accountType=accountType;
}
public String getAccountType() {
	return accountType;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance=balance;
}

public boolean withdraw(int amount) {
	if(balance>=amount) {
		balance=balance-amount;
		System.out.println("balance amount after withdraw:"+balance);
		return true;
	}
	else {
		System.out.println("Sorry!!! No enough balance");
		return false;
		
	}
}
}
