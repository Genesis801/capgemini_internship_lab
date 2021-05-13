package arrayhandson;

import java.util.*;
public class DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter an array index between 0 and "+n+" which needs to be deleted");
		int x=sc.nextInt();
		int newarr[]=new int[n];
		if((x>=0)&&(x<n))
		{
			for(int i=0;i<n;i++)
			{
				if(i==x)
				{
					continue;
				}
				newarr[i]=a[i];
			
			}
		}
		System.out.println("New array after deletion is :");
		for(int i=0;i<n;i++)
			System.out.println(newarr[i]);
	}

}
