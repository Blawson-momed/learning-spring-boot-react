package com.Forces23.learnspringframework.examples.g1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named //using CDI Contexts & Dependency Injections Annotations
class BusinessService{
	private DataService dataService; 
	
	//@Autowired
	@Inject //using CDI Contexts & Dependency Injections Annotations
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
	
	public DataService getDataService() {
		System.out.println("Setter injection ...");
		return dataService;
	}
	
	
}

//@Component
@Named //using CDI Contexts & Dependency Injections Annotations
class DataService{
	
}

@Configuration
@ComponentScan
public class CDIContextLauncherApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = null;
		
		try {
			context = new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class);
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessService.class).getDataService());
			
		}finally {
			if(context != null) {
				context.close();
			}
		}
	}

}
