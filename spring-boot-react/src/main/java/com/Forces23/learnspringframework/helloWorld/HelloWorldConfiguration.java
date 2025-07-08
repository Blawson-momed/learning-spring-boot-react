package com.Forces23.learnspringframework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
//records are used in java 16+
//record Person(String name, int age) { };
//record Address(String streetAddress, String city, String state, int zip) { };
@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name1() {
		return "Bobby";
	}
	
	@Bean
	public int age1() {
		return 27;
	}
	
	//giving the Bean a specific name to call it 
	@Bean(name="namebean")
	public String name2() {
		return "Abdalla";
	}
	 
	@Bean(name="agebean")
	public int age2() {
		return 27;
	}
	
	//created a Bean, hard coded to variables "Caroline" and "24" and passed the default address
	@Bean
	public Person person1() {
		Address address = new Address();
		Person person = new Person("Caroline",24,address);
		return person;
	}
	
	@Bean(name="Person2")//giving a bean a specific name that you can call 
	public Person person2() {
		//instead of creating the object and then returning it in a seperate line 
		//you are able to do it in 1 line... this is the same as the person1 bean
		return new Person("Nick", 33, new Address("123 Orchard Valley rd", "Nashville", "Tennessee", "USA", 12345)); //step10 3:40
	}
	
	//specifing that this Bean is the Primary when calling a Bean using Person.class
	@Bean
	@Primary
	public Person person3MethodCall() {
		Person p = new Person(name1(),age1(), address1());
		return p;
	}
	
	// creating a person using the beans as parameters.. (name, age, address)
	@Bean
	public Person person4Parameters(String namebean, int agebean, Address address2) {
		return new Person(namebean,agebean,address2);
	}
	
	// creating a person using the beans and the address Qualifier, which states which address Bean to look at
	@Bean
	public Person person5Qualifier(String name1, int age1, @Qualifier("address1Qualifier") Address address) {
		Person person = new Person(name1, age1, address);
		return person;
	}
	
	//creating a Bean and stating that his is a Qualifier Bean, and the name of the Qualifier is "address1Qualifier"
	@Bean
	@Qualifier("address1Qualifier")
	public Address address1() {
		return new Address("4 Broadway Village Dr.", "Columbia", "Missouri", "USA", 65201);
	}
	
	//creating a Bean that states what the default Address Bean is 
	@Bean(name="address2")
	@Primary
	public Address address2() {
		return new Address("123 Keino St.", "Mombasa", "N/A", "Kenya", 12345);
	}
}
