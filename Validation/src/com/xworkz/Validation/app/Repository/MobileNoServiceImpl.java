package com.xworkz.Validation.app.Repository;

import com.xworkz.Validation.app.Repository.MobileNoRepository;

public class MobileNoServiceImpl implements MobileNoService {
	
	public MobileNoRepository mobilenorepository;
	public MobileNoServiceImpl( MobileNoRepository mobilenorepository) {
		this.mobilenorepository=mobilenorepository;

}
public boolean ValidationAndSave(long name) {
	if(name>900000000l && name <9999999999l ) {
		System.out.println("name is valid");
		
		if(!this.mobilenorepository.isExist(name)) {
			
			this.mobilenorepository.brand(name);
			return true;
		}
		else {
			System.err.println("mobile " +name+ "is vaild");
		}
		
	}
	else {
		System.err.println("mobile" +name+ "is invalid");
		
	}
	
	return false;
}

}





