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
				
				StringBuilder sb=new StringBuilder("abcd");
				StringBuffer SB=new StringBuffer("abcd");
//				sb.
//				SB.
	}
}
