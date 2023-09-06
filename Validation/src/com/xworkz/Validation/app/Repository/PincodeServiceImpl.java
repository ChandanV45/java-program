package com.xworkz.Validation.app.Repository;

import com.xworkz.Validation.app.Repository.PincodeRepository;

public class PincodeServiceImpl implements PincodeService{
	
	public PincodeRepository pincoderepository;
	public PincodeServiceImpl(PincodeRepository pincoderepository) {
		this.pincoderepository=pincoderepository;
	}
	@Override
	public boolean ValidationAndSave(int pincode) {
		//577201
		if(pincode>500000 && pincode<700000) {
			
			if(!this.pincoderepository.isExist(pincode)) {
				System.out.println("Pinocde is valid");
				this.pincoderepository.place(pincode);
				return true;
			}
		
		else {
			System.out.println("place pincode " +pincode+" is already exists");
		}
	}

		else {
			System.out.println("place pincode" +pincode+ "is invalid");
	}
	
	return false;
	}
}

		
		
		
		
		
		
		
		
		
		
	