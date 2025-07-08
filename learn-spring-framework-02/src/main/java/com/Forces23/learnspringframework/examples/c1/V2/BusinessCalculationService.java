package com.Forces23.learnspringframework.examples.c1.V2;

import java.util.Arrays;

public class BusinessCalculationService {
	private DataService dataService;
	
	public BusinessCalculationService(DataService dataService) {
		super();
		this.dataService = dataService;
	}



	public int findMax() {
		
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}
}
