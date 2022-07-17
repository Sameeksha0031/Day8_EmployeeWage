package com.employeewages.util;

public class EmployeeWage {
	
	int wagePerhour = 20;
	
	public void computeAttendance() {
		 int attendance =(int)(Math.random()*10)%3;
		 switch(attendance){
			 
			case 0 : System.out.println(" Employee is absent ");
			         break;
			
			case 1: System.out.println(" Employee is Present ");
	    	        employeeWage();
	    	        break;
			
			case 2: int partTimehour = 4;
				    System.out.println(" Part time Employee ");
	    	        System.out.println(" Part time hour : " +partTimehour);
	    	        break;
			}
	 }
	 
	 public void employeeWage() {
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
