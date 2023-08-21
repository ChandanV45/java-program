package com.xworkz.app;

public abstract class Vehicle {



	public abstract void start();

	public abstract void stop();

	public abstract void accelerate();

	public abstract void fuel();

	public abstract void turn();

	public void honr() {
		System.out.println("Vehicle is honking.");
	}

	public void lights() {
		System.out.println("Vehicle's lights are turned on.");
	}

	public void wheels() {
		System.out.println("Vehicle's lights are turned off.");
	}

	public void weight() {
		System.out.println("Vehicle is being refueled.");
	}

	public void service() {
		System.out.println("Vehicle is being serviced.");
	}

}