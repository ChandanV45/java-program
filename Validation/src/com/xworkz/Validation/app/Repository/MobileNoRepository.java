package com.xworkz.Validation.app.Repository;

public interface MobileNoRepository { 
	
	int TOTAL_ITEMS=20;
	void brand(long name);
		
		default boolean isExist(long name) {
			return false;
			
	}

}
