package com.xworkz.app;

public class bus extends Vehicle {

	@Override
	public void start() {
		System.out.println("Start");
	}

	@Override
	public void stop() {
		System.out.println("Stop");

	}

	@Override
	public void accelerate() {
		System.out.println("Accelerate");

	}

	@Override
	public void fuel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turn() {
		System.out.println("Turn");
	}

}