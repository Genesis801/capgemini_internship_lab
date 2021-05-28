import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		
		System.out.println("Enter the array elements:");
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		System.out.println("The sorted reverse array is:");
		for(int i=n-1;i>=0;i--)
			System.out.print(a[i]+" ");
		System.out.println();
		sc.close();
	}

}
