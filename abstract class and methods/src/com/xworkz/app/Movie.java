package com.xworkz.app;

public abstract class Movie {

	public abstract void hindi();

	public abstract void action();

	public abstract void theme();

	public abstract void dance();

	public abstract void display();

	public void teaser() {
		System.out.println("Invoking teaser in Movie");

	}

	public void trailer() {
		System.out.println("Invoking trailer in Movie");
	}

	public void video() {
		System.out.println("Invoking video in Movie");
	}

	public void releaseDate() {
		System.out.println("Invoking releaseDate in Movie");
	}

	public void climax() {
		System.out.println("Invoking climax in Movie");
	}

	
}