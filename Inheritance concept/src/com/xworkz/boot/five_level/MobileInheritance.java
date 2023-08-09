 com.xworkz.boot.five_level;

import com.xworkz.app.five_level_Inheritance.SamsunGalaxyPhone;

public class MobileInheritance {

	public static void main(String[] args) {
		System.out.println("invoking main in MobileInheritance");
		 SamsunGalaxyPhone galaxyPhone = new SamsunGalaxyPhone("Samsung","Semiconductor", "Galaxy S21", "Android", "11", "AMOLED", 64);

		 System.out.println("____________________________________________________________________________________________________________");
		 galaxyPhone.displayInfo();

	}

}