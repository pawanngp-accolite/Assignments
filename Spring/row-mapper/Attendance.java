package com.spring.practice;

public class Driver {
	
	private int DriverId;
	private String DriverName;
	public int getDriverId() {
		return DriverId;
	}
	public void setDriverId(int driverId) {
		DriverId = driverId;
	}
	public String getDriverName() {
		return DriverName;
	}
	public void setDriverName(String string) {
		DriverName = string;
	}
	
	

	
	public void toaString(){  
	    System.out.println( DriverId+" "+DriverName);  
	}  
}
	