package Practise;

import java.util.ArrayList;

import java.util.*;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1=new Date(9,14,2000);
		System.out.println(d1.displayDate());
		System.out.println(d1.getMonth());
		boolean check=d1.validateDate();
		if(check)
			System.out.println("Valid");
		else 
			System.out.println("In-Valid");
			
//		Student s1=new Student(101,"Sahil",d1);
//		s1.display();
//		Student s2=new Student(104,"Sahil",d1);
//		s2.display();
//		Student s3=new Student(103,"Sahil",d1);
		//s3.display();
		Scanner sc=new Scanner(System.in);
		ArrayList<Student>ls=new ArrayList<>();
		for(int i=0;i<2;i++)
		{
			
			int regNo=sc.nextInt();
			int dd=sc.nextInt();
			int mm=sc.nextInt();
			int yy=sc.nextInt();
			Date d=new Date(dd,mm,yy);
			String name=sc.next();
			Student s=new Student(regNo,name,d);
			ls.add(s);
		}
		System.out.println(ls.size());
		for(Student s:ls)
		{
			System.out.println(s.getName());
			
		}
	}

}

