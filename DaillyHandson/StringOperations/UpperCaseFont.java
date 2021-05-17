package stringoperations;

import java.util.*;

public class UpperCaseFont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String string=sc.next();
		String newstr="";
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)>=65 && string.charAt(i)<=90) {
				newstr+=string.charAt(i);
			}
		}
		for(int i=0;i<string.length();i++) {
			if(!(string.charAt(i)>=65 && string.charAt(i)<=90)) {
				newstr+=string.charAt(i);
			}
		}
		System.out.println("Output String : "+newstr);
		
		sc.close();
	}

}