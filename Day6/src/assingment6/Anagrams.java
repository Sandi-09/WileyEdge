package assingment6;

import java.util.Arrays;

public class Anagrams {
public static void main(String args[]) {
	String s1=("listen");
	String s2=("silent");
			boolean b=checkAna(s1,s2);
			if(b)System.out.println("Anagrams");
			else System.out.println("Not anagrams");
}

private static boolean checkAna(String s1, String s2) {
	// TODO Auto-generated method stub
	if(s1.length()!=s2.length())
	{
		return false;
	}
	char[]str1=s1.toCharArray();
	char[]str2=s2.toCharArray();
	Arrays.sort(str1);
	Arrays.sort(str2);
	for(int i=0;i<str1.length;i++)
	{
		if(str1[i]!=str2[i]) return false;
	}
	return true;
}
}
