package stringoperations;

import java.util.Scanner;

public class RemoveCharactersFromFirstPresentInSecond {
	
	final static int n = 256;
	
	// Returns an array of size 256 containing count of characters in the passed char array
    static int[] getCharCountArray(String str)
    {
        int count[] = new int[n];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
 
        return count;
    }
 
    // remove characters from first string present in second string
    static String removeDirtyChars(String str1,
                                   String str2)
    {
        int count[] = getCharCountArray(str2);
        int ip_ind = 0, res_ind = 0;
 
        char arr[] = str1.toCharArray();
 
        while (ip_ind != arr.length)
        {
            char temp = arr[ip_ind];
            if (count[temp] == 0) {
                arr[res_ind] = arr[ip_ind];
                res_ind++;
            }
            ip_ind++;
        }
 
        str1 = new String(arr);
 
        return str1.substring(0, res_ind);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first string : ");
		String string1 = sc.next();
		System.out.print("Enter the second string : ");
		String string2 = sc.next();
		System.out.println(removeDirtyChars(string1,string2));
		sc.close();
	}

}