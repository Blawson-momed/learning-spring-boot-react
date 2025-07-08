package com.Forces23.learnspringframework.examples.c1.V1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
@Primary
public class MongoDBDataService implements DataService{
	public int[] retrieveData() {
		return new int[] {11,22,33,44,55};
	}

	public String databaseName() {
		return "--- MongoDB ---";
	}
}
