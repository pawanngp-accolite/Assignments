package com.springdemo.tutorial;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
	
	private static final A a=new A();
	private A()
	{
		
	}

	public static A B()
	{
		return a;
	}
	public void display()
	{
		System.out.println("Accessed private object");
	}
}
