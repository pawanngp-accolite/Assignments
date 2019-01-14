package com.accolite.eu.practice;
import java.util.Scanner;

public class Employee {
public static void main(String[] args) {
	AssistantQAeng j=new AssistantQAeng();
	
	
	
	j.calc();
	
}
}
class softwareEng
{
	int salary;
	
	public softwareEng ()
	{
		System.out.println("started work");
		System.out.println("Enter the salary of software engineer:");
		Scanner ini = new Scanner(System.in);
		this.salary=ini.nextInt();
	}
	
	
}
class  Developer extends softwareEng

{
	public Developer()
	{super();
	
		System.out.println("inside developer class");
	}
	
}
class  QAeng extends Developer

{
	public QAeng()
	{
		System.out.println("inside  QAeng class");
	}
	
}
final class AssistantQAeng extends QAeng
{    
	public AssistantQAeng()
	
	{  
		System.out.println("inside AssistantQAeng class");
	
	}
	public void calc() {
		System.out.println("the salary with tax deducted is:"+(this.salary-this.salary*0.20));
	}
	
}

