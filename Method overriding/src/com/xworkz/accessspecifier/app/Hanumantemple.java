package com.xworkz.accessspecifier.app;

public class Hanumantemple extends Temple {

				@Override
				public void God()
				{
					System.out.println("Invoking god in Hanumantemple");	
				}
				
				@Override
				public void God(String name)
				{
					System.out.println("Invoking god name in Hanumantemple");
				}
				
				@Override
				public void God(String name,int noofgods)
				{
					System.out.println("Invoking god name and noofgods in Hanumantemple");
				}
				
				@Override
				public void God(String name,int noofgods,String location)
				{
					System.out.println("Invoking god name,noofgods and location in Hanumantemple");
				}
				
				@Override
				public void God(int door)
				{
					System.out.println("Invoking god door in Hanumantemple");
				}
				
				@Override
				public void God(int door,String parsada)
				{
					System.out.println("Invoking god door and parsada in Hanumantemple");
				
				}
				
				
			}


