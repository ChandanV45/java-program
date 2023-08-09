package com.xworkz.accessspecifier.app;

public class Bakery {
	
	public void item()
	{
		System.out.println("Invoking item in bakery");	
	}
	
	public void item(String name)
	{
		System.out.println("Invoking item name in bakery");
	}
	
	public void item(String name,int pieces)
	{
		System.out.println("Invoking item name and pieces in bakery");
	}
	
	public void item(String name,int pieces,String chocolate)
	{
		System.out.println("Invoking item name,pieces and chocolate in bakery");
	}
	
	public void item(int noofbox)
	{
		System.out.println("Invoking item noofbox in bakery");
	}
	
	public void item(int noofbox,String location)
	{
		System.out.println("Invoking item noofbox and location in bakery");
	
	}
	
	
}
