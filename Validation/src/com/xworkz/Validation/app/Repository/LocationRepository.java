package com.xworkz.Validation.app.Repository;

public interface LocationRepository {
	
	int TOTAL_ITEMS=20;
	void banglore(String location);
	
	default boolean isExist(String location) {
	return false;

	
}
}
