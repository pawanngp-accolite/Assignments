package com.spring.au.service;

import java.util.List;

import javax.xml.ws.ServiceMode;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.au.dao.impl.StudentDao;
import com.spring.au.model.Student;

@ServiceMode
public class StudentService {
	@Autowired
	StudentDao std;
	
	public String getStudentName()
	{
		return std.getName();
		
	}

	public void insert(Student student) {
		std.add(student);
		
	}

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	public List<Student> getAll() {
	
		return std.getAll();
	}

}
