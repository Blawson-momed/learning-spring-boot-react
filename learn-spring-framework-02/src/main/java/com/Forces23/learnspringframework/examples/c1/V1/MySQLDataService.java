package com.Forces23.learnspringframework.examples.c1.V1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public class MySQLDataService implements DataService{
	public int[] retrieveData() {
		return new int[] {1,2,3,4,5};
	}

	public String databaseName() {
		return "--- MySQL ---";
	}
}
