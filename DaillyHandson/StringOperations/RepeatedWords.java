package stringoperations;

import java.util.*;
public class RepeatedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String string=sc.nextLine();
		String wrds[]=string.split(" ");
		System.out.println("Repeated words are : ");
		for(int i=0;i<wrds.length;i++)
		{
			for(int j=i+1;j<wrds.length;j++)
			{
				if(wrds[i].equalsIgnoreCase(wrds[j]))
				{
					System.out.print(wrds[j]+" ");
					break;
				}
			}
		
		}
		sc.close();
	}

}