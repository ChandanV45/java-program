package com.xworkz.boot;

import com.xworkz.app.Coal;
import com.xworkz.app.Coalname;
import com.xworkz.app.Drum;
import com.xworkz.app.Drumsize;
import com.xworkz.app.Ticket;
import com.xworkz.app.TheaterTicket;
public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Invoking main in Mainrunner");
		Coal coal=new Coalname();
		coal.burn();
		
		System.out.println("###");
			
		Drumsize Drum=new Drumsize();
		Drum.shape();
		
		System.out.println("###");
		
		TheaterTicket ticket=new TheaterTicket();
		ticket.Counter();
		
		
		}
	}


