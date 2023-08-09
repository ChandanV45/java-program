
package com.xworkz.boot.single_level;

import com.xworkz.app.single_level.MotorCycle;
import com.xworkz.app.single_level.Vechicle;

public class MotorCycleRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in MotorCycleRunner");

		Vechicle vehicle=new MotorCycle(12.0);
		vehicle.run();


	}

}