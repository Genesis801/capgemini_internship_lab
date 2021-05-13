package lab_2;

import java.util.*;

public class ReverseElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		getSorted(a,n);
	}
	static void getSorted(int a[], int n)
	{
		int i,j,t;
		int b[]=new int[n];
		
		for(i=0;i<n;i++)
		{
			b[i]=a[i];
		}
		System.out.println("The reverse array is:");
		for(i=n-1;i>=0;i--)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println("\nThe sorted reverse array is:");
		Arrays.sort(b);
		
		for(i=0;i<n;i++)
			System.out.println(b[i]);
	}

}
