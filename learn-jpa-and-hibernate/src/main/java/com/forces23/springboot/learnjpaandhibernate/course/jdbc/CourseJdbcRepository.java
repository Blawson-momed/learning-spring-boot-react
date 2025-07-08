package com.forces23.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.forces23.springboot.learnjpaandhibernate.course.Course;

//use @Repository when your class talks to a database
@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	//wanted to use text blocks but you need java 14+
	private static String INSERT_QUERY = "insert into course (id, name, author)"
										+"values(?,?,?);";

	private static String DELETE_QUERY = "delete from course where id=?";
	
	private static String SELECT_QUERY = "select * from course "
										+"where id=?";
	
	public void insert(Course course) {
		//executing the INSERT_QUERY and passing the id, name, and author from course class using getters
		//they replace the ? in the order you pass them in
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
	
	public Course findById(long id) {
		//Result -> Bean => Row Mapper =>
		return springJdbcTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);
		
		
	}
	
}
