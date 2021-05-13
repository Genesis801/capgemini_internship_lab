package lab_1;

import java.util.*;
public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a choice red/yellow/green"); 
		String choice=sc.next();
		switch(choice) 
		{
		case "red":
			System.out.println("Stop");
			break;
		case "yellow":
			System.out.println("Ready");
			break;
		case "green":
			System.out.println("Go Go Go");
			break;
			default:
				System.out.println("Invalid Choice");
		}
	}

}
