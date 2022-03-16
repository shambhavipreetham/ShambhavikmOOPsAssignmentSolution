package com.gl.departments;

//SuperDepartment class is the superclass

public class SuperDepartment {
	
	/* SuperDepartment contains 4 methods of return type String 
	 and will not accept any parameter */
	
	public String departmentName() {
		
		return "Super Department";
	}
	
	public String getTodaysWork() {
		
		return "No Work as of now";
	}
	
	public String getWorkDeadline() {
		
		return "Nil";
	}
	
	public String isTodayAHoliday() {
		
		return "Today is not a Holiday";
	}

}
