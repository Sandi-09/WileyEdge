package assingment6;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String rev="";
		String word[]=s.split(" ");
		if(word.length==1)
		{
			char[] ch=word[0].toCharArray();
			for(int i=ch.length-1;i>=0;i--)
			{
				rev+=ch[i];
			}
		}
		else {
		for(int i=word.length-1;i>=0;i--)
		{
			rev+=word[i]+" ";
		}
		}
		System.out.println(rev);
		sc.close();
	}

}
