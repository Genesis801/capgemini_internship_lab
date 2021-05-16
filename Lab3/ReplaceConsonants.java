package lab_3;

import java.util.*;
public class ReplaceConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		String str=alterString(s.toCharArray());
		System.out.println(str);
		sc.close();
	}
	static String alterString(char[] st)
	{
		for(int i=0;i<st.length;i++)
		{
			
			if((st[i]=='a')||(st[i]=='e')||(st[i]=='i')||(st[i]=='o')||(st[i]=='u'))
			{
				continue;
			}
			else
			{
				int r=(int)st[i];
				st[i]=(char)(r+1);
			}
		}
		return String.valueOf(st);
	}
}
