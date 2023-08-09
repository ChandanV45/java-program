package com.xworkz.accessspecifier.boot;

import com.xworkz.accessspecifier.app.Bakery;
import com.xworkz.accessspecifier.app.Bakerypackets;
import com.xworkz.accessspecifier.app.City;
import com.xworkz.accessspecifier.app.CityBhasyam;
import com.xworkz.accessspecifier.app.Hanumantemple;
import com.xworkz.accessspecifier.app.Temple;
import com.xworkz.accessspecifier.app.Hotel;
import com.xworkz.accessspecifier.app.Hotelrajajinagar;


public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Invoking main in runner");
		
		Bakery bakery=new Bakerypackets();
		bakery.item();
		bakery.item("sweets");
		bakery.item("sweets",3);
		bakery.item("sweets",3,"dairymilk");
		bakery.item(5);
		bakery.item(5,"bangalore");
		System.out.println("-----");
		Bakery bakery1=new Bakerypackets();
		bakery1.item();
		bakery1.item("sweets");
		bakery1.item("sweets",3);
		bakery1.item("sweets",3,"dairymilk");
		bakery1.item(5);
		bakery1.item(5,"bangalore");
		
		System.out.println("####################");
		
		City city=new CityBhasyam();
		city.route();
		city.route("Rajajinagar");
		city.route("Rajajinagar",2);
		city.route("Rajajinagar",2,"Banaglore");
		city.route(8);
		city.route(8,"lulu");
		System.out.println("-----");
		City city1=new CityBhasyam();
		city1.route();
		city1.route("Rajajinagar");
		city1.route("Rajajinagar",2);
		city1.route("Rajajinagar",2,"Banaglore");
		city1.route(8);
		city.route(8,"lulu");
		
		System.out.println("####################");
		
		Temple temple=new Hanumantemple();
		temple.God();
		temple.God("rammandira");
		temple.God("rammandira",3);
		temple.God("rammandira",3,"bhasyam");
		temple.God(2);
		temple.God(2,"pulivagare");
		System.out.println("-----");
		Temple temple1=new Hanumantemple();
		temple1.God();
		temple1.God("rammandira");
		temple1.God("rammandira",3);
		temple1.God("rammandira",3,"bhasyam");
		temple1.God(2);
		temple1.God(2,"pulivagare");
		
		System.out.println("####################");
		
		Hotel hotel=new Hotelrajajinagar();
		hotel.food();
		hotel.food("fern");
		hotel.food("fern",200);
		hotel.food("fern",200,"good");
		hotel.food(2);
		hotel.food(2,"shimoga");
		System.out.println("----");
		Hotel hotel1=new Hotelrajajinagar();
		hotel1.food();
		hotel1.food("fern");
		hotel1.food("fern",200);
		hotel1.food("fern",200,"good");
		hotel1.food(2);
		hotel1.food(2,"shimoga");
        
	}

}
