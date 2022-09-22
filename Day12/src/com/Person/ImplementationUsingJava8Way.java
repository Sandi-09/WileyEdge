package com.Person;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ImplementationUsingJava8Way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> ls = new ArrayList<>();
		ls.add(new Person("Sandi", "Singh", 21));
		ls.add(new Person("Ram", "Singh", 28));
		ls.add(new Person("Rahul", "kar", 74));
		ls.add(new Person("Aman", "Chouhan", 31));
		ls.add(new Person("Mohit", "Gupta", 21));
		ls.add(new Person("Rohit", "gupta", 29));

		System.out.println("Filtered ages of the friends are =>");
		/*
		 * Here in the condition we are passing the int type that is the reason we have
		 * to write our lambda this way
		 */
		// printConditionally(ls, (p)->{return (p<30);});

		System.out.println("Friends starting last name with S==>");
		printConditionally(ls, (p) -> p.getLastName().startsWith("S"));

		// using the predicate and the consumer interface together
		System.out.println("Friends starting last name with G==>");
		printConditionallyUsingInterfaces(ls,
				(p) -> (p.getLastName().startsWith("G") || p.getLastName().startsWith("g")),
				p -> System.out.println(p));
	}

	// using the consumer and predicate interface here we dont need to write our own
	// conditions
	// checks on its own test method and gives the desired results back.
	private static void printConditionallyUsingInterfaces(ArrayList<Person> ls, Predicate<Person> condition,
			Consumer<Person> consumer) {
		// TODO Auto-generated method stub
		for (Person person : ls) {
			if (condition.test(person))
				consumer.accept(person);
		}
	}

	private static void printConditionally(ArrayList<Person> ls, Condition condition) {
		// TODO Auto-generated method stub
		for (Person p : ls) {
			if (condition.test(p)) {
				System.out.println("the person is -->" + p);
			}
		}
	}

}
