package lab_1;

import java.util.*;
import java.math.*;
public class CheckPower {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean result=checkNumber(n);
		if(result==true)
			System.out.println("Number is a power of 2");
		else
			System.out.println("Number is not a power of 2");
	}
	static boolean checkNumber(int n)
	{
		//boolean res;
		int d=(int)(Math.log(n)/Math.log(2));
		double p=Math.pow(2, d);
		if(p==n)
			return true;
		else
			return false;
	}

}
