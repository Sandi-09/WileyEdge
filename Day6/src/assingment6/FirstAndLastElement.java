package assingment6;

public class FirstAndLastElement {
public static void main(String args[])
{
	String s=new String("abcadda");
	//char ch[]=s.toCharArray();
	int n[]=new int[] {1,2,6,9,8,7};
	int sizeString=s.length()-1;
	int sizeInt=n.length-1;
	if(s.charAt(0)==(s.charAt(sizeString)))
	{
		System.out.println("First and last elements are equal");
	}
	else
		System.out.println("Not Equal");
	
	if(n[0]==n[sizeInt])
	{
		System.out.println("First and last elements are equal");
	}
	else
		System.out.println("Not Equal");
}
}
