package com.xworkz.app;

public class Umbrella {

	public void rain()
	{
		System.out.println("invoking rain with no args");
		rain("Green",500);
	}

	public void rain(String color)
	{
		System.out.println("invoking rain String in args");
		System.out.println("Color of the umbrella is "+color);
	}

	public void rain(double price)
	{
		System.out.println("Invoking rain double in args");
		System.out.println("Price of the umbrella is "+price);
	}

	public void rain(String color,double price)
	{
		System.out.println("Inoking rain String ,int in args");
		rain(color);
		rain(price);
	}

}
