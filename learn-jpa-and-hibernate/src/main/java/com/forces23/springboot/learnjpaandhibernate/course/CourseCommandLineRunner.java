package com.forces23.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.forces23.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.forces23.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.forces23.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component 
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	//private long id = 1;
	
	@Override
	public void run(String... args) throws Exception {
		
		repository.save(new Course(1,"Learn Spring Boot", "in28minutes"));
		repository.save(new Course(2,"Learn JPA", "in28minutes"));
		repository.save(new Course(3,"Learn DevOps", "in28minutes"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByName("Learn JPA"));
		
	}

}
