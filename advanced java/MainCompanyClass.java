package com.accolite.eu.employee;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class MainCompanyClass {
	public static void main(String[] args) {
	
		int n;
		Scanner input = new Scanner(System.in);
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("HELLO");
		System.out.println("how many companies do you want to input?");
	
		
		n=input.nextInt();
		
			Company comp[]=new Company[n];
			
		for(int i=0;i<n;i++)
			{
				comp[i]=new Company();
			}
			
			
			
		for (int i=0;i<n;i++)
			{
				String streetName;
				String cityName;
				int NE;
				String ename;
				int eid;
				int eage;
			
				
				System.out.println("input company name");
				String ll=input.nextLine();
				comp[i].setCompanyname(ll);
				
				System.out.println("input company street");
				streetName = input.nextLine();
				
				System.out.println("input company City");
				cityName = input.nextLine();
				
				comp[i].setAddress(streetName, cityName);
				
				
				System.out.print("company location details:");
				System.out.println(comp[i].CompanyName);
				System.out.println(comp[i].address.city);
				System.out.println(comp[i].address.street);
				
				comp[i].Emplo=new LinkedList<>();
				System.out.println("Mention the number of employess");
				NE=input1.nextInt();
				for(int j=0;j<NE;j++)
				{
					System.out.println("Employee name");
					ename = input.nextLine();
					System.out.println("Employee id");
					eid=input1.nextInt();
					System.out.println("Employee Age");
					eage=input.nextInt();
				    comp[i].Emplo.add(new Employee(ename,eid,eage));
				}
			}
			
	for(int k=0;k<n;k++)
	{
	         System.out.println(" ");
	         System.out.println("Employees Sorted Based on Age");
			 Collections.sort(comp[k].Emplo,new salary());
	      for(Employee q:comp[k].Emplo)
	         {
	                 System.out.println(q.toString());
			 }
			         System.out.println(" ");
	                 System.out.println("Employees Sorted Based on Names");
	                 Collections.sort(comp[k].Emplo, new NameSort());
	      for(Employee w:comp[k].Emplo)
	         {
		            System.out.println(w.toString());
	         }
	                System.out.println(" ");
	                System.out.println(" Employees whose age is less than 30");
		  for(Employee m:comp[k].Emplo)
		  {
		      if ( m.age < 30)
		           {
		            	
			            System.out.println(m.toString());
		     	
		           }
		    }
		  
		  
		}
		
		
			
			}
		}
class Employee {
	String EmployName;
	int age;
	int id;
	
	public Employee(String ename,int eid, int eage)
	{
		this.EmployName=ename;
		this.age=eage;
		this.id=eid;
	}
	public String getEmployname() {
		return EmployName;
	}
	public int getId() {
		return id;
	}
	public int getAge() {
		return age;
	}
	public String toString(){
        return "Name: "+this.EmployName+"-- Age: "+this.age;
    }
	

}
 class Company {
	String CompanyName;
	List<Employee> Emplo;
	Address address;
	public String getCompanyname() {
		return CompanyName;
	}
	public void setCompanyname(String CompanyName) {
		this.CompanyName = CompanyName;
	}
	
	public void setAddress(String s,String c) {
		this.address=new Address();
		this.address.street = s;
		this.address.city=c;
	}
	
	

}

 class Address {
	String street;
	String city;
	
	

}
 class salary implements Comparator<Employee>{
	 
	    @Override
	    public int compare(Employee e1, Employee e2) {
	        if(e1.getAge() > e2.getAge()){
	            return 1;
	        } else {
	            return -1;
	        }
	    }
	}
 class NameSort implements Comparator<Employee> 
 {
     
     public int compare(Employee a, Employee b) 
     { 
         return a.EmployName.compareTo(b.EmployName); 
     } 
 } 
	