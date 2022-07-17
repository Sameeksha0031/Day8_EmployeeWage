package com.employeewages.util;

public class EmployeeWage {

	 public void computeAttendance() {
		 int attendance =(int)(Math.random()*10)%2;
		 if (attendance == 1 ) {
	        	
	        	System.out.println(" Employee is Present ");
	        	employeeWage();
	        	
	        } else {
	        	
	        	System.out.println(" Employee is Absent ");
	        }
	 }
	 
	 public void employeeWage() {
			int wagePerhour = 20;
			int fullDayhour = 8;
			int dailyWage = wagePerhour * fullDayhour;
			System.out.println(" Employee daily wage is : "+ dailyWage);
		}
	 
	public static void main(String[] args) {
		
		System.out.println("Welcome to Employee Wage Computation");
		 EmployeeWage employee = new  EmployeeWage();
		 employee.computeAttendance();
	}

}
