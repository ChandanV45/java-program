package com.xworkz.app;

public class Mouse {

	public void Button()
	{
		System.out.println("Invoking button with no args");
		Button("hp",2);
	}

	public void Button(String brand)
	{
		System.out.println("Invoking select with boolean args");
		System.out.println("Is brand mouse:"+brand);
	}

	public void Button(int noOfButtons)
	{
		System.out.println("Invoking select with int args");
		System.out.println("No of buttons are:"+noOfButtons);
	}

	public void Button(String brand,int noOfButtons)
	{
		System.out.println("Invoking select with String,int args");
		Button(brand);
		Button(noOfButtons);
	}

}