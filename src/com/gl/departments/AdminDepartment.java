package com.gl.departments;

//AdminDepartment class is extending superclass SuperDepartment

public class AdminDepartment extends SuperDepartment {
	
	/* AdminDepartment will contain 3 methods of return type String 
	  and will not accept any parameter */
	
	public String departmentName() {
		
		return "Admin Department";
	}
	
	public String getTodaysWork() {
		
		return "Complete your documents submission";
	}
	
	public String getWorkDeadline() {
		
		return "Complete by EOD";
	}

}
