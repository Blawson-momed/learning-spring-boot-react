/*
 * This is the Business Calculations Application using Component
 * where Spring Framework creates/manages the Beans for you 
 * 
 */

package com.Forces23.learnspringframework.examples.c1.V1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessCalculationLauncherApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = null;
		
		try {
			context = new AnnotationConfigApplicationContext(BusinessCalculationLauncherApplication.class);
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println();
			System.out.println("DataBase : ");
			System.out.println(context.getBean(DataService.class).databaseName());
			System.out.println();
			System.out.println("Data List : ");
			Arrays.stream(context.getBean(DataService.class).retrieveData()).forEach(System.out::println);
			System.out.println();
			System.out.println("Data MAX : ");
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
			System.out.println();
			
		}finally {
			if(context != null) {
				context.close();
			}
		}
	}

}
