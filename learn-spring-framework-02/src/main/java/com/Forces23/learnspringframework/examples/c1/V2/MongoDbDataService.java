package com.Forces23.learnspringframework.examples.c1.V2;

public class MongoDbDataService implements DataService{

	
	public int[] retrieveData() {
		return new int[] {11,22,33,44,55};
	}

	
	public String databaseName() {
		return "--- MongoDB ---";
	}

}
