package com.spring.practice;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {
	
	
	public static void main(String[] args) {
	
		System.out.println("Start : Using Spring:***********************");
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			 A a=(A)applicationContext.getBean("a");  
		    a.message();  
		
		
		JDBCTemplateDAO jdbc=applicationContext.getBean(JDBCTemplateDAO.class);
	   Attendance at=new Attendance();
	    JDBCTemplateDAO dao=(JDBCTemplateDAO)applicationContext.getBean("jdbcTemplate");  
	   List<Attendance> list=jdbc.getAllEmployeesRowMapper();
		at.setDriverId(11);
		at.setDriverName("pawan");
		
		jdbc.saveAttendance(at);
		jdbc.saveStudentUsingPreparedStatement(at);
	    for(Attendance e:list)  
	    {
	    	System.out.println(e.getDriverName());
	    	System.out.println(e.getDriverId());
	    	
	    	System.out.println(" ");
	    	e.toaString();
	    }
	}

}