/*
 * This Project uses maven 3.2.0 which needs java 17+
 * Spring Boot 3
 * Work machine only has java 1.8.0 = java 8
 * Home machine has java 19
 */

package com.forces23.springboot.learnspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}

}
