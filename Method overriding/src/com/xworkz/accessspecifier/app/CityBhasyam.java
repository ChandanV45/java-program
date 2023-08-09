package com.xworkz.accessspecifier.app;

public class CityBhasyam extends City{

		    @Override
			public void route()
			{
				System.out.println("Invoking route in CityBhasyam");	
			}
			
		    @Override
			public void route(String name)
			{
				System.out.println("Invoking route name in CityBhasyam");
			}
			
		    @Override
			public void route(String name,int typeofroots)
			{
				System.out.println("Invoking route name and typeofroots in CityBhasyam");
			}
			
		    @Override
			public void route(String name,int pieces,String location)
			{
				System.out.println("Invoking route name,typeofroots and location in CityBhasyam");
			}
			
		    @Override
			public void route(int signals)
			{
				System.out.println("Invoking route signals in CityBhasyam");
			}
			
		    @Override
			public void route(int signals,String shop)
			{
				System.out.println("Invoking route signals and shop in CityBhasyam");
			
			}
			
			
		}
