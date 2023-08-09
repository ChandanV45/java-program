package com.xworkz.boot.second_level;

import com.xworkz.app.second_level.Animal;
import com.xworkz.app.second_level.Dog;

public class DogRunner {

	public static void main(String[] args) {

		System.out.println("Invoking main in DogRunner");


		Dog dog=new Dog("German Shepard");

		System.out.println("-----------------------------------------------");
		dog.bark();
		dog.eat();
		dog.produceMilk();
		System.out.println("-----------------------------------------------");

		Animal animal=new Dog("Golden Retriever");


	}

}