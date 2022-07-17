package com.employeewages.util;

public class EmployeeWage {
	
	public void computeAttendance() {
		 int attendance =(int)(Math.random()*10)%3;
		 if (attendance == 1 ) {
	        	
	        	System.out.println(" Employee is Present ");
	        	employeeWage();
	        	
	        }else if(attendance == 2) {
	        	int partTimehour = 4;
	        	System.out.println(" Part time Employee ");
	        	System.out.println(" Part time hour : " +partTimehour);
	        	
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
