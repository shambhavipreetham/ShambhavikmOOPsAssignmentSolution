package com.gl.departments;

//TechDepartment class will extend superclass SuperDepartment

public class TechDepartment extends SuperDepartment {
	
	/* TechDepartment will contain 4 methods of return type String 
	 and will not accept any parameter */
	
	public String departmentName() {
		
		return "Tech Department";
	}
	
	public String getTodaysWork() {
		
		return "Complete coding of Module 1";
	}
	
	public String getWorkDeadline() {
		
		return "Complete by EOD";
	}
	
	public String getTechStackInformation() {
		
		return "Core Java";
	}

}
