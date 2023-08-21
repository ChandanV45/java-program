package com.xworkz.boot;
import com.xworkz.app.Academicproject;
import com.xworkz.app.Animals;
import com.xworkz.app.Project;
import com.xworkz.app.Tiger;

public class Main {
	 
	public static void main(String[] args) {
		System.out.println("Invoking main in main");
		
		Academicproject a=new Academicproject();
		a.start();
		a.implement();
				
		System.out.println("----");
		
		
		
		 Tiger tiger=new Tiger();


		 tiger.name();
		 tiger.size();
		 tiger.forest();
		 tiger.gender();

	     System.out.println("-----");

	
	}
}
