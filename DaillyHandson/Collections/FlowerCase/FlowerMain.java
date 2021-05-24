package com.capgemini.collectionsdemo;

import java.util.*;

public class FlowerMain {

	static Scanner sc=new Scanner(System.in);
	
	Flower  fl;
	static HashSet<Flower> flList = new HashSet<Flower>();
	
	//Create flower method
	public static void createDetails() {	

		System.out.println("Enter the details of Flower");
			for(int i=0;i<2;i++) {

				System.out.println("Enter the Flower id");
				int id = sc.nextInt();
				System.out.println("Enter the Flower Name");
				String name = sc.next();
				
				System.out.println("Enter price per kg");
				int ppkg=sc.nextInt();
				
				System.out.println("Enter Quantity");
				int qty=sc.nextInt();
				
				flList.add(new Flower(id, name, ppkg, qty));
			}
	}
	
	static Iterator<Flower> flItr = flList.iterator();
	
	//Display details method
	public static void displayDetails() { 	
		flItr = flList.iterator();
		System.out.println("Flower HashSet values using Iterator");
		int k=1;
		while(flItr.hasNext()) {
			Flower fl = flItr.next();
			System.out.println(fl.toString(k));
			k++;
			System.out.println();
		}
	}
	
	
	//remove flower
	public static void removeFlower() {
		flItr = flList.iterator();
		
		while(flItr.hasNext()) {
			Flower fl = flItr.next();
			if(fl.getQty()<=0) {
				flItr.remove();
			}
		}
		System.out.println(flItr);
	}
	
	//main method
	public static void main(String[] args) {
		
		char ch='y';
		while(ch=='y') {
		System.out.println("1.Enter Flower Details\n2.Remove Flower\n3.Display Contents");
		System.out.println("====================================================");
		System.out.print("Enter your choice: ");
		int choice=sc.nextInt();
		System.out.println();
		
		switch(choice) {
		case 1:
			createDetails();
			break;
		case 2:
			removeFlower();
			break;
		case 3:
			displayDetails();
			break;
		default:System.out.println("Wrong Choice "); 
				
		}
		System.out.println("====================================================");
		System.out.println("Do you want to continue (y/n)?");
		ch=sc.next().trim().charAt(0);
		
		if(ch=='n') {
			System.out.println("------------------Thank you--------------------");
		}
		}
		sc.close();
	}

}
