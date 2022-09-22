package com.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ImplementationUsingJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person>ls=new ArrayList<>();
		ls.add(new Person("Sandi","Singh",21));
		ls.add(new Person("Ram","Singh",28));
		ls.add(new Person("Rahul","kar",74));
		ls.add(new Person("Aman","Chouhan",31));
		ls.add(new Person("Mohit","gupta",21));
		
		sortFriends(ls);
		displayAllFriends(ls);
		diplayAllPeopleWithLastName(ls);
	}

	private static void diplayAllPeopleWithLastName(ArrayList<Person> ls) {
		// TODO Auto-generated method stub
		
		//implement some buisness logic according to the use case
		/*
		 * these are the redundant way to traverse the list and get the desired results
		 * but after java 8 there are more efficient ways using the lambdas;
		 */
	}

	private static void displayAllFriends(ArrayList<Person> ls) {
		// TODO Auto-generated method stub
		System.out.println("List of the Friends ==>");
		for(Person person:ls) {
			if(person.getLastName().startsWith("S"))
				System.out.println(person);
		}
	}

	private static void sortFriends(ArrayList<Person> ls) {
		// TODO Auto-generated method stub
		System.out.println("Friends sorted According to their first Name-->");
		Collections.sort(ls,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		for(Person p:ls) {
			System.out.println(p);
		}
	}

}
