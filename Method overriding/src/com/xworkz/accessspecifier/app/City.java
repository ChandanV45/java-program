package com.xworkz.accessspecifier.app;

public class City {
	
		public void route()
		{
			System.out.println("Invoking route in City");	
		}
		
		public void route(String name)
		{
			System.out.println("Invoking route name in City");
		}
		
		public void route(String name,int typeofroots)
		{
			System.out.println("Invoking route name and typeofroots in City");
		}
		
		public void route(String name,int typeofroots,String location)
		{
			System.out.println("Invoking route name,typeofroots and location in City");
		}
		
		public void route(int signals)
		{
			System.out.println("Invoking route signals in City");
		}
		
		public void route(int signals,String shop)
		{
			System.out.println("Invoking route signals and shop in City");
		
		}
		
		
	}

