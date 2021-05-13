import java.util.*;
public class ArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the size of the array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter  the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				System.out.println("0");
				continue;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==0)
				break;
			else
				System.out.println(a[i]);
		}
	}

}
