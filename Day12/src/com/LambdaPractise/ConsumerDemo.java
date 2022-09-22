package com.LambdaPractise;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerDemo /*implements Consumer*/ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Rahul";
		Consumer<String>consumer=new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		};
		consumer.accept(name);
		
		//lambda way
		Consumer<String> c=(cName)->System.out.println("hey good morning "+cName);
		c.accept(name);

		//for each method
		ArrayList<Integer>ls=new ArrayList<>();
		ls.add(1);
		ls.add(3);
		ls.add(5);
		ls.add(0);
		ls.forEach((c1)->System.out.println(c1));
		
	}
	
	
//if we implement the consumer interface normally
//we need to override its unimplimentated method 
//as this is a functional interface we can use lambdas and anonymous classes on it.
//	@Override
//	public void accept(Object t) {
//		// TODO Auto-generated method stub
//		
//	}

}
