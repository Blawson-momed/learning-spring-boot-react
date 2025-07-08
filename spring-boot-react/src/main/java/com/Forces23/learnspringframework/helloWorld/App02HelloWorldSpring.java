package com.Forces23.learnspringframework.helloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//1 : Launch a Spring Context(Application) 
		AnnotationConfigApplicationContext context = null;
		try {
			context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
			
			//2 : Configure the things that we what Spring to manage - 
			// HelloWorldConfiguration = @Configuration 
			//name = @Bean 
			
			//3 : Retrieving Beans managed by Spring 
			System.out.println(context.getBean("name1")); //calling specific bean in HelloWorldConfiguration.java
			System.out.println(context.getBean("age1")); 
			System.out.println(context.getBean("person1")); // calls the  name of the bean method
			System.out.println(context.getBean("Person2")); // calls the bean name that i gave it
			System.out.println(context.getBean("person3MethodCall")); // Uses methods call as the arguments to get the data needed to create the person object
			System.out.println(context.getBean("person4Parameters")); // sets the beans as the parameters to create the object
			System.out.println(context.getBean("address1"));
			System.out.println(context.getBean(Person.class)); // calls the bean class... make sure class is imported
			System.out.println(context.getBean(Address.class)); // calls the bean class... make sure class is imported 
			System.out.println(context.getBean("person5Qualifier")); // calls the Person Bean that is using a Qualifier in the parameters
			
			System.out.println();
			System.out.println("Listing all beans created : ");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
		}finally{
			if(context != null) {
				context.close();
			}
		}
	}

}
