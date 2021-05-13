package lab_1;

import java.util.*;
public class IncreasingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		boolean res=check(n);
		if(res==true)
			System.out.println("It is Increasing Number");
		else
			System.out.println("It is not an Increasing Number");
	}
	
	static boolean check(int n)
	{
		int i,r,d,t;
		t=n;
		i=0;
		while(t>10)
		{
			r=t%10;
			t=t/10;
			d=t%10;
			if(d>r)
			{
				i=1;
				break;
			}
		}
		if(i==1)
			return false;
		else
			return true;
	}

}
