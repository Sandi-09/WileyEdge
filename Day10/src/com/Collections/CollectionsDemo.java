package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>ls=new ArrayList<>();
		//ArrayList
		ls.add(20);
		ls.add(80);
		ls.add(280);
		ls.add(790);
		ls.add(201);
		
		
		//toString method of collection to print the contents of the list
		System.out.println(ls);
		
		//for loop
		for(int i=0;i<ls.size();i++) {
			System.out.println("Inside the for loop-->"+ls.get(i));
		}
		System.out.println();
		//for each loop --enhanced for loops
		for(Integer i:ls) {
			System.out.println("Inside the enhanced loop-->"+i);
		}
		System.out.println();
		//using iterator method to traverse the list
		Iterator<Integer>nums=ls.iterator();                     //2,4,5
		    System.out.println(nums+" "+ls.hashCode());
		   
		    while(nums.hasNext()) {
			int data = nums.next();
			System.out.println("In the iterator method-->"+data);
		}
		
		ArrayList<Student>list=new ArrayList<>();
		list.add(new Student(101,"Rohan",85));
		list.add(new Student(102,"Rohit",85));
		list.add(new Student(1015,"Rohini",75.5));
		
		System.out.println();
		System.out.println("List of marks unsorted");
		for(Student s:list) {
			System.out.println(s.getStudentMarks());
		}
		//this is done using comparable
		Collections.sort( list);
		
		System.out.println("List of marks sorted");
		for(Student s:list) {
			System.out.println(s.getStudentMarks());
		}
		System.out.println();
		Collections.sort(list,new SortByMarks());
		System.out.println("List of marks sorted using comparator");
		for(Student s:list) {
			System.out.println(s.getStudentMarks()+" "+s.getStudentName());
		
		}
		System.out.println();
		System.out.println("List of names sorted using comparator");
		Collections.sort(list,new SortByName());
		for(Student s:list) {
			System.out.println(s.getStudentName());
		}
		System.out.println();
		System.out.println("List of names sorted using lambda comparator");
	    Collections.sort(list, (p1, p2) -> {
	         return p1.getStudentName().compareTo(p2.getStudentName()); 
	      });
	    System.out.println(list);
	}
	//lexicographically comparisons are done using compareTo (a with b)

}
