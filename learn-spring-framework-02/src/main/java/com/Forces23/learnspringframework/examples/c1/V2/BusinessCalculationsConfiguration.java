package com.Forces23.learnspringframework.examples.c1.V2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

public class BusinessCalculationsConfiguration {

	@Bean
	@Primary
	public DataService dataService1() {
		MongoDbDataService dataService1 = new MongoDbDataService();
		return dataService1;
	}
	
	@Bean
	public DataService dataService2() {
		MongoDbDataService dataService2 = new MongoDbDataService();
		return dataService2;
	}
	
	@Bean
	public BusinessCalculationService businessCalculationService(DataService dataService) {
		BusinessCalculationService businessCalculationService = new BusinessCalculationService(dataService);
		return businessCalculationService;
	}
}
