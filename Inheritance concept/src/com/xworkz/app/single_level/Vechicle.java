package com.xworkz.app.single_level;

public class Vechicle {

	public static String name;

	public Vechicle(String name)
	{
		System.out.println("Invoking no-arg const in Vehicle");
		this.name=name;
	}

	public void run()
	{
		System.out.println("Invoking run in Vehicle");
	}

}