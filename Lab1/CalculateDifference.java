package lab_1;

import java.util.*;
public class CalculateDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sumsq,sum;
		int diff;
		diff=calculatedifference(n);
		System.out.println("Difference is : "+diff);
	}
	static int calculatedifference(int n)
	{
		int d=0;
		int s=0,sq=0;
		for(int i=1;i<=n;i++)
		{
			s+=i;
			sq=sq+(i*i);
		}
		d=sq-(s*s);
		return d;
	}
}
