package com.xworkz.Validation.app.Repository;

import com.xworkz.Validation.app.Repository.MobileNoRepository;

public class MobileNoRunner {

	public static void main(String[] args) {
		
		
		MobileNoRepository mobilenorepository=new MobileNoRepositoryImpl();
		MobileNoServiceImpl mobilenoserviceImpl=new MobileNoServiceImpl(mobilenorepository);
		mobilenoserviceImpl.ValidationAndSave(9945092050l);
		mobilenoserviceImpl.ValidationAndSave(9999999984l);
		

	}

}
