package com.src;

import java.util.Scanner;

public class AccountDetails1 {
	Accountd a=new Accountd();
	Scanner sc=new Scanner(System.in);
	
	public Accountd getAccountDetails() {
		System.out.println("Enter account id:");
		int accountId=sc.nextInt();
		System.out.println("Enter account type:");
		String accountType=sc.next();
		while(true) {
			System.out.println("Enter balance:");
			int balance=sc.nextInt();
			if(balance<=0) {
				System.out.println("Balance should be positive");
			}
			else {
				a.setBalance(balance);
				break;
				
			}
			
		}
		a.setAccountId(accountId);
		a.setAccountType(accountType);
		return a;
		
		
	}	
public int getWithdrawAmount() {
			
			int amount;
			while(true) {
				System.out.println("Enter the amount to be withdrawn");
			amount=sc.nextInt();
			if(amount<=0) {
				System.out.println("Amount should be positive");
				continue;
			}
			else {
				break;
				
			}
		}
			return amount;
			
	}	
		
		
		
	

	public static void main(String[] args) {
		AccountDetails1 a1=new AccountDetails1();
		Accountd d=a1.getAccountDetails();
		boolean withdraw=d.withdraw(a1.getWithdrawAmount());
		
		
	}

}
