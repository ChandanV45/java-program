package com.xworkz.app;

public class TheaterTicket extends Ticket {
	
 @Override
 public void Counter(){
	 
  super.Counter();
  System.out.println("Invoking Counter in Ticket");
 }
  
}
