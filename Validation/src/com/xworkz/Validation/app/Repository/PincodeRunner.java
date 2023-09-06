package com.xworkz.Validation.app.Repository;

public class PincodeRunner {

	public static void main(String[] args) {
		
		 PincodeRepository pincoderepository=new PincodeRepositoryImpl();
		 PincodeServiceImpl pincodeserviceimpl=new PincodeServiceImpl(pincoderepository);
		 pincodeserviceimpl.ValidationAndSave(577222);
		 pincodeserviceimpl.ValidationAndSave(577201);

	}

}
