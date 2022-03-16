package com.gl.departments;

//HrDepartment class is extending superclass SuperDepartment

public class HrDepartment extends SuperDepartment {

	/* HrDepartment will contain 4 methods of return type String 
	  and will not accept any parameter */
	
	public String departmentName() {
		
		return "HR Department";
	}
	
	public String getTodaysWork() {
		
		return "Fill today’s timesheet and mark your attendance";
	}
	
	public String getWorkDeadline() {
		
		return "Complete by EOD";
	}
	
	public String doActivity() {
		
		return "team Lunch";
	}
}
