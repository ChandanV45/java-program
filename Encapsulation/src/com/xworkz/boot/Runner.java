package com.xworkz.boot;
 
import com.xworkz.app.Amazon;
import com.xworkz.app.Cred;
import com.xworkz.app.Facebook;
import com.xworkz.app.Github;
import com.xworkz.app.Instagram;
import com.xworkz.app.Irctc;
import com.xworkz.app.NammaMetro;
import com.xworkz.app.Netflix;
import com.xworkz.app.Ola;
import com.xworkz.app.Watshap;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("Invoking main in Amazon");
		
        Amazon Amazon=new Amazon();
        Amazon.setAmount(200);
        Amazon.getAmount();
        
        System.out.println("Invoking main in Cred");
		
        Cred Cred=new Cred();
        Cred.setBankName("abcd");
        Cred.getBankName();

        System.out.println("Invoking main in Facebook");
		
        Facebook Facebook=new Facebook();
        Facebook.setemail("chandan9731@gmail.com");
        Facebook.getemail();
        
        System.out.println("Invoking main in Github");
		
        Github Github=new Github();
        Github.setusername("abcd");
        Github.getusername();

		System.out.println("Invoking main in watshap");
		
		Watshap watshap=new Watshap();
		watshap.setprofile("pic");
		watshap.getprofile();
		
		Watshap watshap1=new Watshap();
		watshap1.setnumber(8464746472l);
		watshap1.getnumber();
		
		watshap.setimage("photo");
		watshap.getimage();
		
		System.out.println("\n");
		System.out.println("Invoking main in instagram");
		
		Instagram instagram=new Instagram();
		instagram.setusername("chndan");
		instagram.getusername();
		
		instagram.setfollowers(23);
		instagram.getfollowers();
	}

}
