package com.Forces23.learnspringframework.examples.a1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class YourBusinessClass {
	//@Autowired // Field injection 
	Dependency1 dependency1;
	//@Autowired // Field injection 
	Dependency2 dependency2;
	
	
	//@Autowired // Constructor Injection 
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection - YourBusinessClass...");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	//@Autowired // Setter injection 
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("Setter Injection D1...");
		this.dependency1 = dependency1;
	}
	
	//@Autowired // Setter injection
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("Setter Injection D2...");
		this.dependency2 = dependency2;
	}

	//@Override
	public String toString() {
		return "YourBusinessClass [dependency1=" + dependency1 + ", dependency2=" + dependency2 + "]";
	}
	
	
}
