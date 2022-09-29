package StringFolder;
public class Implimentation{
	public static void main(String Args[]) {
     //  System.out.println("Sandi");
		String str="ABC";
		str=str+"ac";

				
				System.out.println("**********After************");
				System.out.println(str+"-"+str.hashCode());
//				System.out.println(s+"-"+s.hashCode());
//				System.out.println(b+"-"+b.hashCode());
				
				String s1="ab";
				String s2="ab";
				System.out.println(s1.hashCode());
				System.out.println(s2.hashCode());
				
				if(s1==s2)
					System.out.println("True");
				else
					System.out.println("False");
				
				s2=s2.charAt(0)+"b";
				System.out.println(s2.hashCode());
				System.out.println(s2);
				
				if(s1.equals(s2))
					System.out.println("True");
				else
					System.out.println("False");
				
			//	StringBuilder sb=new StringBuilder("abcd");
			//	StringBuffer SB=new StringBuffer("abcd");

				String s = "You are good boy and you do your work in time";
				String words[] = s.split(" ");
				
				for(String word: words)
					System.out.println(word);
				
				
				String str1=new String("sandi").intern();//Forcefully putting the String object outside of constant pool 
				//intern method pushes the string explicitly in the constant pool 
				String str2="sandi";
				
				System.out.println(str1==str2);
				System.out.println(str1.hashCode());
				System.out.println(str2.hashCode());
				
				//string buffer and string builder implementation
				StringBuffer sb=new StringBuffer("abc");
				//sb.toString();	
				StringBuilder sb1=new StringBuilder("abc");
				//sb1.toString();
				if(sb1.toString().equals(sb.toString()))System.out.println("string builder and buffer are equal");
				else
					System.out.println("here they are not equal");
				
				System.out.println(sb.hashCode());
				System.out.println(sb1.hashCode());
				
				String name1="abc";
				String name2="xyz";
				System.out.println(name1.hashCode());
				name1=name1+name2;
				System.out.println(name1.hashCode());
				if(name1.equals(name2))System.out.println("this process is created");
				else
					System.out.println("not equal");
				System.out.println(name1.hashCode());
				System.out.println(name2.hashCode());
			
				
				String complicatedString="Welcome to some *stuff $ which ## I am going to do @ I am Done [ how you are doing]";
				String[] meaningfulwords=complicatedString.split("[!,?.*_'@ ]+");
				for(String word:meaningfulwords) {
					System.out.println(word);
				}
	}
}
