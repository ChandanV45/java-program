package com.xworkz.boot.three_level;

import com.xworkz.app.three_level.SeniorManager;

public class SeniorManagerRunner {

	public static void main(String[] args) {
		System.out.println("invoking main in SeniorMangerRunner");

		SeniorManager senior=new SeniorManager("Vinay","Infosis","Marketing",24);

		senior.displayInfo();
	}

}