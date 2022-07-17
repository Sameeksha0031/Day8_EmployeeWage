package com.employeewages.util;

public class EmployeeWage {

	 public void computeAttendance() {
		 int attendance =(int)(Math.random()*10)%2;
		 if (attendance == 1 ) {
	        	
	        	System.out.println(" Employee is Present ");
	        	
	        } else {
	        	
	        	System.out.println(" Employee is Absent ");
	        }
	 }
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		 EmployeeWage employee = new  EmployeeWage();
		 employee.computeAttendance();
	}

}
