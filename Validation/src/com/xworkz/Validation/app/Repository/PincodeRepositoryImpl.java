package com.xworkz.Validation.app.Repository;

public class PincodeRepositoryImpl implements PincodeRepository {
	
	int[] pincodes=new int[TOTAL_ITEMS];
	int position=0;
	
	@Override
	public void place(int pincode) {
		System.out.println("Invoking pincoderepositoryimpl in pincoderepository");
		if(this.position<TOTAL_ITEMS){
			this.pincodes[position]=pincode;
			System.out.println("place pincode " +pincode+ ""+this.position);
			this.position++;
			
		}
		else {
			System.out.println("aaa");
		}
		
	}
	
	@Override
	public boolean isExist(int pincode) {

		for(int index=0; index<this.position; index++) {
		int temp=this.pincodes[index];
		if(temp==pincode) {
		System.out.println("pincode is already exists");

		return true;
		
		}
		}
		
		return PincodeRepository.super.isExist(pincode);
	}
	
	

}
