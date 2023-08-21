package com.xworkz.boot;

	import com.xworkz.app.Ceo;
	import com.xworkz.app.Cook;
	import com.xworkz.app.Kalla;
	import com.xworkz.app.Mechanic;
	import com.xworkz.app.Minister;
	import com.xworkz.app.Sniper;

	public class Main {

		public static void main(String[] args) {
			System.out.println("Invoking main in Main");

			System.out.println("-----------------------------------------------------------------------------------------");

			Minister minister1 = new Minister();
			Minister minister2 = new Minister("Jane Smith", "Party B", 8, "MBA", "456 Oak Ave", 50);

			System.out.println(minister1.toString());
			System.out.println(minister2.toString());

			System.out.println("minister1.equals(minister2): " + minister1.equals(minister2));

			System.out.println("-----------------------------------------------------------------------------------------");

			Cook cook1 = new Cook("Michael Johnson", "Italian Cuisine", 8, "Pasta Paradise", "City Center", 28);
			Cook cook2 = new Cook("Emily Smith", "French Cuisine", 12, "Le Bistro", "Riverside", 32);

			System.out.println(cook1.toString());
			System.out.println(cook2.toString());

			System.out.println("cook1.equals(cook2): " + cook1.equals(cook2));

			System.out.println("-----------------------------------------------------------------------------------------");

			Ceo ceo1 = new Ceo("John Doe", "ABC Corporation", 10, "MBA", "123 Main St", 45);
			Ceo ceo2 = new Ceo("Jane Smith", "XYZ Industries", 15, "PhD", "456 Oak Ave", 50);

			System.out.println(ceo1);
			System.out.println(ceo2);

			System.out.println("ceo1.equals(ceo2): " + ceo1.equals(ceo2));

			System.out.println("-----------------------------------------------------------------------------------------");

			Kalla kalla1 = new Kalla("John Doe", "Specialization 1", 5, "Attribute 1", "Location 1", 25);
			Kalla kalla2 = new Kalla("Jane Smith", "Specialization 2", 8, "Attribute 2", "Location 2", 30);

			System.out.println(kalla1);
			System.out.println(kalla2);

			System.out.println("kalla1.equals(kalla2): " + kalla1.equals(kalla2));

			System.out.println("-----------------------------------------------------------------------------------------");

			Mechanic mechanic1 = new Mechanic("John Brown", "Automotive", 10, "ASE Certified", "Garage Workshop", 35);
			Mechanic mechanic2 = new Mechanic("Alice Davis", "Aircraft", 15, "FAA Certified", "Hangar Workshop", 40);

			System.out.println(mechanic1);
			System.out.println(mechanic2);

			System.out.println("mechanic1.equals(mechanic2): " + mechanic1.equals(mechanic2));

			System.out.println("-----------------------------------------------------------------------------------------");

			Sniper sniper1 = new Sniper("Mark Smith", "M40A5", 5, "Woodland", "Hidden Spot", 30);
			Sniper sniper2 = new Sniper("Sarah Johnson", "AWM", 8, "Ghillie Suit", "Mountain Ridge", 28);

			System.out.println(sniper1);
			System.out.println(sniper2);

			System.out.println("sniper1.equals(sniper2): " + sniper1.equals(sniper2));
		}

	}

