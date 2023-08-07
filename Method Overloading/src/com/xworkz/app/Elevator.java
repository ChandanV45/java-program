package com.xworkz.app;

public class Elevator { 

	public void lift()
	{
		System.out.println("Invoking lift of no args");
		lift("Steel",5000);
	}
	public void lift(String material)
	{
		System.out.println("Invoking lift of String args");
		System.out.println("Material is:"+material);
	}

	public void lift(double price)
	{
		System.out.println("Invoking lift of double args");
		System.out.println("Price:"+price);
	}

	public void lift(String material, double price)
	{
		System.out.println("Invoking lift of String, double args");
		lift(material);
		lift(price);
	}

}
 