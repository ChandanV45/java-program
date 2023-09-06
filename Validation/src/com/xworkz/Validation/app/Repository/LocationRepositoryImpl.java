package com.xworkz.Validation.app.Repository;

public class LocationRepositoryImpl implements LocationRepository {
	String[] locations = new String[TOTAL_ITEMS];
	int position=0;
	
	@Override
	public void banglore(String location) {
		System.out.println("Invoking locationimpl in location");
		if(this.position<TOTAL_ITEMS) {
			this.locations[position]=location;
			System.out.println("location in banglore "+location+ " "+this.position);
			this.position++;
		}
		else {
			System.out.println("aaaa");
		}
		
	}

	
	@Override
	public boolean isExist(String location) {
	
		for(int index=0; index<this.position; index++)
		{
			String temp=this.locations[index];
			if(temp!=null &&temp.equals(location)) {
				System.out.println("location is already exists");
				return true;
			}
				
		}
		
		return LocationRepository.super.isExist(location);
	}
}
