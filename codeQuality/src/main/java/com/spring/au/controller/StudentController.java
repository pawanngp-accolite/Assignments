package com.spring.au.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.au.model.Student;
import com.spring.au.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentservice;
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	@RequestMapping("/getName")
	public String getName()
	{
	return studentservice.getStudentName();
	}

	@PostMapping("/insert/studentDetails")
	public void insert(@RequestParam Student student)
	{
		studentservice.insert(student);
	}
	
	@PostMapping("/getALL")
	public List<Student> getAll()
	
	{
		return studentservice.getAll();
	}
	
}
