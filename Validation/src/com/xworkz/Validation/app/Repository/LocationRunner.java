package com.xworkz.Validation.app.Repository;

import com.xworkz.Validation.app.Repository.LocationRepository;

public class LocationRunner {
	
	public static void main(String[] args) {
		
		LocationRepository locationrepository=new LocationRepositoryImpl();
		LocationServiceImpl locationserviceimpl=new LocationServiceImpl(locationrepository);
		locationserviceimpl.ValidationAndSave("Rajajinagar");
		locationserviceimpl.ValidationAndSave("bhasyam");
		
		
	}

}
