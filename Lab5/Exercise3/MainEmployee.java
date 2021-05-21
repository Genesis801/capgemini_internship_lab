package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("Enter the Employee ID : ");
			int id=sc.nextInt();
			
      System.out.print("Enter the Employee Name : ");
			sc.nextLine();
      String name=sc.nextLine();
			
      System.out.print("Enter Employee Age : ");
			int age=sc.nextInt();
			
      System.out.print("Enter Employee salary : ");
			double salary=sc.nextDouble();
			
      Employee e = new Employee(id,name,age,salary);
			e.validateSalary(salary);
		
    }catch(EmployeeException e) {
			System.out.println("Error : "+e);
		}
		sc.close();
	}

}
