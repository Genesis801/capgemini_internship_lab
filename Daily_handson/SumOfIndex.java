package arrayhandson;

import java.util.*;
public class SumOfIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n=sc.nextInt();
		int sume=0,sumo=0;
		System.out.println("Enter the array elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				sume=sume+a[i];
			}
			else
				sumo=sumo+a[i];
		}
		System.out.println("Even index sum = "+sume);
		System.out.println("Odd index sum ="+sumo);
	}

}
