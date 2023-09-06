package com.xworkz.Validation.app.Repository;

public class MobileNoRepositoryImpl implements MobileNoRepository {
	
	long[] mobiles =new long[TOTAL_ITEMS];
	int position=0;
	
	@Override
	public void brand(long name) {
		System.out.println("Invoking mobilenoimpl in mobile");
		if(this.position<TOTAL_ITEMS) {
		 this.mobiles[position]=name;
		 System.out.println("mobiles "+name+" "+this.position);
		 this.position++;
	
	}
	else {
		System.out.println("sss");
	}
	
	}
	
	
	@Override
	public boolean isExist(long name) {
		for(int index=0; index<this.position; index++) {
			
			long temp=this.mobiles[index];
			if(temp==name) {
				System.out.println("name is already exist");
				return true;
			}
			
		}
		return MobileNoRepository.super.isExist(name);
	}
	}




