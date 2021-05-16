package lab_3;

import java.util.*;
public class MirrorImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.next();
		getImage(s);
		sc.close();
	}
	static void getImage(String s)
	{
		StringBuffer sbf=new StringBuffer(s);
		
		StringBuffer str=sbf.reverse();
		System.out.println(s+"|"+str);
		
	}

}
