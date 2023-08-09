package com.xworkz.accessspecifier.app;

public class Hotelrajajinagar extends Hotel {

			@Override
			public void food()
			{
				System.out.println("Invoking food in Hotelrajajinagar");	
			}
			
			@Override
			public void food(String name)
			{
				System.out.println("Invoking food name in Hotelrajajinagar");
			}
			
			@Override
			public void food(String name,int price)
			{
				System.out.println("Invoking food name and price in Hotelrajajinagar");
			}
			
			@Override
			public void food(String name,int price,String taste)
			{
				System.out.println("Invoking food name,pieces and taste in Hotelrajajinagar");
			}
			
			@Override
			public void food(int branch)
			{
				System.out.println("Invoking food branch in Hotelrajajinagar");
			}
			
			@Override
			public void food(int branch,String location)
			{
				System.out.println("Invoking food branch and location in Hotelrajajinagar");
			
			}
			
			
		}
