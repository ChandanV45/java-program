package com.xworkz.accessspecifier.app;

public class Hotel {
		
		public void food()
		{
			System.out.println("Invoking food in hotel");	
		}
		
		public void food(String name)
		{
			System.out.println("Invoking food name in hotel");
		}
		
		public void food(String name,int price)
		{
			System.out.println("Invoking food name and price in hotel");
		}
		
		public void food(String name,int price,String taste)
		{
			System.out.println("Invoking food name,pieces and taste in hotel");
		}
		
		public void food(int branch)
		{
			System.out.println("Invoking food branch in hotel");
		}
		
		public void food(int branch,String location)
		{
			System.out.println("Invoking food branch and location in hotel");
		
		}
		
		
	}


