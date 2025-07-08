/*
 * This is the Business Calculations Application creating the
 * Beans and doing all the configurations yourself 
 * 
 */

package com.Forces23.learnspringframework.examples.c1.V2;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BusinessCalculationLauncherApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = null;
		
		try {
			context = new AnnotationConfigApplicationContext(BusinessCalculationsConfiguration.class);
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println("DataService : ");
			System.out.println(context.getBean(DataService.class).databaseName());
			System.out.println();
			System.out.println("Database Values : ");
			Arrays.stream(context.getBean(DataService.class).retrieveData()).forEach(System.out::println);
			System.out.println();
			System.out.println("Max Value Found : ");
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
			
		}finally {
			if(context != null) {
				context.close();
			}
		}
	}

}
