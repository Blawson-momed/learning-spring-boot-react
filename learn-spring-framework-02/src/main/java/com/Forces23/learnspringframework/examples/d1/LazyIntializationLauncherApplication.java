package com.Forces23.learnspringframework.examples.d1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
}

@Component
@Lazy
class ClassB{
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		//Logic
		System.out.println("Some Intialization Logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Something Happened ...");
	}
}

@Configuration
@ComponentScan
public class LazyIntializationLauncherApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = null;
		
		try {
			context = new AnnotationConfigApplicationContext(LazyIntializationLauncherApplication.class);
			System.out.println("Initialization of Context is Completed ... ");
			
			context.getBean(ClassB.class).doSomething();
			
		}finally {
			if(context != null) {
				context.close();
			}
		}
	}

}
