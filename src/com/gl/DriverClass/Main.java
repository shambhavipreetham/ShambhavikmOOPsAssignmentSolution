package com.gl.DriverClass;

import com.gl.departments.AdminDepartment;
import com.gl.departments.HrDepartment;
import com.gl.departments.TechDepartment;

//Driver class Main will be used to create objects of HrDepartment, TechDepartment, AdminDepartment

public class Main {

	public static void main(String[] args) {
		
		AdminDepartment admin = new AdminDepartment();
		HrDepartment hres = new HrDepartment();
		TechDepartment techdep = new TechDepartment();
		
		//Each department will display all its functionalities
		
		System.out.println("Welcome to "+admin.departmentName());
		System.out.println(admin.getTodaysWork());
		System.out.println(admin.getWorkDeadline());
		System.out.println(admin.isTodayAHoliday());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Welcome to "+hres.departmentName());
		System.out.println(hres.doActivity());
		System.out.println(hres.getTodaysWork());
		System.out.println(hres.getWorkDeadline());
		System.out.println(hres.isTodayAHoliday());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Welcome to "+techdep.departmentName());
		System.out.println(techdep.getTodaysWork());
		System.out.println(techdep.getWorkDeadline());
		System.out.println(techdep.getTechStackInformation());
		System.out.println(techdep.isTodayAHoliday());
	}

}
