package com.capgemini.lab9;

import java.util.Scanner;

/**
 * Main program using Lambda Expression for inserting space between each character of a String
 * @author genesis
 *
 */

public class StringFormatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		StringFormatUsingLambdaExpression se = (string)->{
			char characters[]=string.toCharArray();
			String result="";
			for(int i=0;i<characters.length-1;i++) {
				result+=characters[i]+" ";
			}
			return result+characters[characters.length-1];
		};
		System.out.print("Enter the string : ");
		String string=sc.next();
		System.out.println("\nResultant string = "+se.returnExpression(string));
		
		sc.close();

	}

}
