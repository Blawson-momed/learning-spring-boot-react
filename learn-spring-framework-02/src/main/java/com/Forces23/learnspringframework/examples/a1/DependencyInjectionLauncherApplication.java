package com.Forces23.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = null;
		
		try {
			context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class);
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(YourBusinessClass.class));
		}finally {
			if(context != null) {
				context.close();
			}
		}
	}

}
