package com.xworkz.app.second_level;
public class Animal {

	public static String name;

	public Animal(String name)
	{
		System.out.println("invoking no-arg const in Animal");
		this.name=name;
	}

	 public void eat() {
	        System.out.println("Animal is eating");
	    }

}