package com.xworkz.Validation.app.Repository;
import com.xworkz.Validation.app.Repository.LocationRepository;

public class LocationServiceImpl implements LocationService{

	public LocationRepository locationrepository;
	public LocationServiceImpl(LocationRepository locationrepository) {
		this.locationrepository=locationrepository;

	}
	@Override
	public boolean ValidationAndSave(String location) {
	
		if(location!=null && !location.isEmpty() && location.length()>=7 && location.length()<=15) {
			System.out.println("location is valid");
			
			if(!this.locationrepository.isExist(location)) {
				this.locationrepository.banglore(location);
				return true;
				
			}
			
			else {
				System.out.println("banglore location in " +location+" is valid");
			}
		}
	
			else {
				System.out.println("banglore location is" +location+ "is invalid");
		}
		
		return false;

	}
	
	
	
	
	
	
	
	
	
	
}
