package com.forces23.springboot.learnjpaandhibernate.course;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity (name="Course_Details") // if youre table and bean have different names then use this to map your bean to your table
@Entity //our bean table match so no need to use mapping entity
public class Course {
	
	@Id
	private long id;
	//@Column(name="name") //used if youre variables dont mactch the table values
	private String name;
	//@Column(name="author") //dont need since my variables and table values match
	private String author;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	
	
	
}
