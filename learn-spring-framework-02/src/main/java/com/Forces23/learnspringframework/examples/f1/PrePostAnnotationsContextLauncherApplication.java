package com.Forces23.learnspringframework.examples.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All Depenedencies are ready ...");
	}
	
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	
	@PreDestroy 
	public void cleanup() {
		//where you might want to close your active connections
		System.out.println("cleanup");
	}
	
}

@Component
class SomeDependency{

	public void getReady() {
		System.out.println("Some logic using the Dependency");
		
	}
	
}


@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = null;
		
		try {
			context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class);
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}finally {
			if(context != null) {
				context.close();
			}
		}
	}

}
