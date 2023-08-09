package com.xworkz.boot.four_level;

import com.xworkz.app.four_level.AsusRog;
import com.xworkz.app.four_level.ElectronicDevice;

public class AsusRogRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in AsusRogRunner");

		AsusRog asusRog=new AsusRog("Semiconductor","Alienware", "M15", 15.6, 8, "RGB Lighting");
		System.out.println("---------------------------------------------------------------------------------");
		ElectronicDevice ele=new AsusRog("Semiconductor","Alienware", "M15", 15.6, 8, "RGB Lighting");
		System.out.println("---------------------------------------------------------------------------------");
		asusRog.displayInfo();
	}

}