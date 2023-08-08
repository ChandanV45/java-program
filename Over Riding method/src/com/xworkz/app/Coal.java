package com.xworkz.app;

public class Coal {
	
	public String name;
	
	public void burn()
	{
		System.out.println("Invoking burn in coal" );
	}
	
	public void burn(String name)
	{
		System.out.println("Invoking String burn in coal");
	}

}
