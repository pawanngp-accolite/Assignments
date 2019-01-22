package com.springdemo.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext  = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		A a=(A)applicationContext.getBean("a");
		a.display();
	
		
		
	}
	
}
