package lab_1;

import java.util.*;
public class SumOfCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int t=num;
		int sum=0,r;
		while(t>0)
		{
			r=t%10;
			sum=sum+(r*r*r);
			t=t/10;
		}
		System.out.println("Sum of Cubes of "+num+" is = "+sum);
	}

}
