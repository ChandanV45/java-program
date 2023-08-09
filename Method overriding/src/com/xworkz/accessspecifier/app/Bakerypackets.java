package com.xworkz.accessspecifier.app;

public class Bakerypackets extends Bakery {
		
	    @Override
		public void item()
		{
			System.out.println("Invoking item in bakerypackets");	
		}
		
	    @Override
		public void item(String name)
		{
			System.out.println("Invoking item name in bakerypackets");
		}
		
	    @Override
		public void item(String name,int pieces)
		{
			System.out.println("Invoking item name and pieces in bakerypackets");
		}
		
	    @Override
		public void item(String name,int pieces,String chocolate)
		{
			System.out.println("Invoking item name,pieces and chocolate in bakerypackets");
		}
		
	    @Override
		public void item(int noofbox)
		{
			System.out.println("Invoking item noofbox in bakerypackets");
		}
		
	    @Override
		public void item(int noofbox,String location)
		{
			System.out.println("Invoking item noofbox and location in bakerypackets");
		
		}
		
		
	}



