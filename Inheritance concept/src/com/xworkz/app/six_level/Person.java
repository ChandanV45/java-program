package com.xworkz.app.six_level;

public class Person {
	public String name;

    public Person(String name) {
    	System.out.println("invoking const in Person");
        this.name = name;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + ".");
    }

}