package StreamsImplementation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

import com.Person.Person;

public class StreamDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person>ls=new ArrayList<>();
		ls.add(new Person("Sandi","Singh",21));
		ls.add(new Person("Ram","Singh",28));
		ls.add(new Person("Rahul","kar",74));
		ls.add(new Person("Aman","Chouhan",31));
		ls.add(new Person("Mohit","gupta",21));
		
		
		//Creating streams
		System.out.println("Creating Streams");
		ls.stream().forEach((p)->System.out.println(p));
		
		/*
		 * there are majorly two types of operations on streams
		 * 1-Intermediate function such as .map,.filter
		 * 2-Terminal functions which terminates the stream such as .forEach,.Collect
		 */
		System.out.println();
		System.out.println("friends with age more than 24 ------------------------------>");
		ls.stream().filter((p)->p.getAge()>24).forEach((p)->System.out.println(p));
		System.out.println();
		
		//count of person with the age more than 50
		System.out.println("Number of persons with age more than 50 :");
		long count=ls.stream().filter((p)->p.getAge()>50).count();
		System.out.println(count);
		System.out.println();
		
		//using the .map function of the stream
		//acts like a map which has a key value pair
		//considered as lazy operations,these are intermidiate functions
		// These operations are always lazy. Intermediate operations are invoked on a Stream instance and after they finish their processing, they give a Stream instance as output.
		System.out.println("map operations");
		//in map we can map only one parameter against a field;
		List<String>list=ls.stream().filter((p)->p.getAge()>30)
				.map(person->person.getFirstName())/*.forEach((person)->System.out.println(person));*/
				.map(person->person.toUpperCase())		
				.collect(Collectors.toList());
	}
	

}
