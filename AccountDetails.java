package com.src;
import java.util.*;

public class AccountDetails {
	public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
 
 Account a=new Account();
 System.out.println("Enter account id:");
 int accountid=sc.nextInt();
 System.out.println("Enter account type:");
 String accountType=sc.next();
 
	 System.out.println("Enter balance:");
	 int balance=sc.nextInt(); 
     if(balance<=0) {
    	 System.out.println("Balance should be positive");
    	 
     }else {
     System.out.println("Enter amount to be withdrawn:");
     int amount=sc.nextInt();
     if(amount>balance) {
    	 System.out.println("Sorry!!! No enough balance");
     }
     
     else {
    	 balance=balance-amount;
System.out.printf("Balance amount after withdraw:");
    System.out.print(balance);
 
     }
     }
     
 AccountgetAccountDetails(); {
	a.setAccountId(accountid);
	a.setAccountType(accountType);
	a.setBalance(balance);
}
  getWithdrawAmount(); {
	 a.getAccountId();
	 a.getAccountType();
	 a.getBalance();
 }
 
 



 
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	private static void getWithdrawAmount() {
		// TODO Auto-generated method stub
		
	}

	private static void AccountgetAccountDetails() {
		// TODO Auto-generated method stub
		
	}
	
}

	