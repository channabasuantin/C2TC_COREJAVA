package com.src;

import java.util.Scanner;
public class CinemaTicket{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of ticket:");
        int ticket=sc.nextInt();
        if(ticket>5 && ticket<40) {
        System.out.println("Do you want refreshment:");
        String refreshment=sc.next();
        System.out.println("Do you have coupon code:");
        String code=sc.next();
        System.out.println("Enter the circle:");
        String circle=sc.next();
       
        double cost=0;
       
        switch(circle) {
        case "k":{
        	double value=75;
                cost=ticket*value;
                 if(ticket>20) {
                	 cost=cost-((0.1)*cost);
                 }
                if(code.equals("y")) {
                	 cost=cost-((0.02)*cost);
                 }
                  if(refreshment.equals("y")){
                	 cost=cost+(ticket*50);
                 }
                 System.out.println("Ticket cost:"+String.format("%.2f",cost));
                 break;
        }
       
        case "q":{int value=150;
                 cost=ticket*value;
                 if(ticket>20) {
                	 cost=cost-(0.1)*cost;
                 }
                 if(code.equals("y")) {
                	 cost=cost-((0.02)*cost);
                 }
                if(refreshment.equals("y")){
                	 cost=cost+(ticket*50);
                 }
                 System.out.println("Ticket cost:"+String.format("%.2f",cost));
                 break;
        }
        default:System.out.println("Invalid Input");
        }
        
        
    }
        else {
        	System.out.println("Minimum 0f 5 and maximum of 40 tickets");
        }
    }
    
    
}


