package stringoperations;

import java.util.*;
public class Anagram {
	
	static boolean areAnagram(String s1, String s2)
    {
		char str1[]=s1.toLowerCase().toCharArray();
		char str2[]=s2.toLowerCase().toCharArray();
        int n1 = str1.length;
        int n2 = str2.length;
  
        // If length of both strings is not same then they cannot be anagram
        if (n1 != n2)
            return false;
  
        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);
  
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
                return false;
  
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String string1 = sc.next();
		System.out.print("Enter the second string : ");
		String string2 = sc.next();
		if(areAnagram(string1,string2))
			System.out.println("Both strings are anagrams of each other");
		else
			System.out.println("The strings are not anagrams of each other");
		
		sc.close();
	}

}