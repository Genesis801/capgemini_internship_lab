package com.capgemini.collectionsdemo;

import java.util.*;
import java.util.regex.Pattern;

public class CustomerMain {

	static Scanner sc=new Scanner(System.in);
	
	static ArrayList<Customer> cst=new ArrayList<Customer>();
	static Customer c;
	
	public static void createCustomer() {
		
		System.out.println("Enter Customer Details:");
		System.out.println("---------------------------------------------------------");
		System.out.println("Enter Customer  Id");
		int id=sc.nextInt();
		
		System.out.println("Enter Customer  Name");
		String name=sc.next();
		
		System.out.println("Enter Customer age");
		int age=sc.nextInt();
		
		System.out.println("Enter date of birth");
		String dob=sc.next();
		
		System.out.println("Enter email address");
		String email=sc.next();
		validateEmail(email);
		
		System.out.println("Enter mobile number");
		String mob=sc.next();
		validateMobile(mob);
		
		cst.add(new Customer(id, name, age, dob, email, mob));
		
	}
	
	static Iterator<Customer> cstItr = cst.iterator();
	public static void displayCustomer() {
		cstItr=cst.iterator();
		int i=1;
		
		while(cstItr.hasNext()) {
			Customer c=cstItr.next();
			System.out.println(c.toString(i));
			i++;
			System.out.println("---------------------------------------------------------");
		}
		
	}
	
	public static void validateMobile(String s) {
			boolean res=Pattern.matches("[789]{1}[0-9]{9}",s);
			if (res==true)
				System.out.println("Mobile number valid");
			else{
				System.out.println("Mobile number invalid \nPress 1 to re-enter press 0 to cancel and exit");
			
				int choice=sc.nextInt();
				if(choice==1){
					createCustomer();
				}
				if(choice==0) {
					System.exit(0);
				}
				if(choice!=0 || choice != 1)
				{
					System.out.println("Too many failed attempts");
					System.exit(0);
				}
			}
	}
	
	public static void validateEmail(String s) {
		boolean res=Pattern.matches("^[a-zA-Z0-9+_.-]+@(.+)$", s);
		if (res==true)
			System.out.println("Email valid");
		else{
			System.out.println("Invalid Email Address \nPress 1 to re-enter press 0 to cancel and exit");
			int choice=sc.nextInt();
			if(choice==1){
				createCustomer();
			}
			if(choice==0) {
				System.exit(0);
			}
			if(choice!=0 || choice != 1)
			{
				System.out.println("Too many failed attempts");
				System.exit(0);
			}
		}
}
	public static void main(String[] args) {
		
		char ch='y';
		while(ch=='y') {
			System.out.println("1.Create New Customer Customer\n2.Display Customer details");
			System.out.println("========================================================");
			System.out.print("Enter your choice:");
			
			int choice=sc.nextInt();
			System.out.println();
			
			switch(choice) {
			case 1:
				createCustomer();
				break;
			case 2:
				displayCustomer();
				break;
				default:
					System.out.println("Wrong Choice");
			}
			System.out.println("========================================================");
			System.out.println("Do you want to continue (y/n)?");
			ch=sc.next().trim().charAt(0);
			
			if(ch=='n') {
				System.out.println("------------------Thank You---------------------");
			}
		}
		
	}

}
