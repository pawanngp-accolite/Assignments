package com.spring.au.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.au.model.Student;
import com.spring.au.rowmapper.RowMapperImpl;


// TODO: Auto-generated Javadoc
/**
 * The Class StudentDao.
 */
public class StudentDao {

	/** The jdbc template. */
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName()
	{
		return jdbcTemplate.queryForObject("select StudentName from student",String.class);
	}

	/**
	 * Adds the.
	 *
	 * @param student the student
	 */
	public void add(Student student) {
	 jdbcTemplate.update("insert into student values ("+student.getStudentId()+", '"+student.getStudentName() +"'); ");
		
		
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	public List<Student> getAll() {
		RowMapperImpl a=new RowMapperImpl();
	 
		return a.getAllStudentsRowMapper();
	}

}
