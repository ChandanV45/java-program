package com.xworkz.Validation.app.Repository;

public interface PincodeRepository {
	
	int TOTAL_ITEMS=20;
	void place(int pincode);
	
	default boolean isExist(int pincode) {
	return false;

}
}