package com.LambdaPractise;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=1;
		//Always remember to provide the class when you are using the predicate and consumer interface.
		Predicate<Integer> p=new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				if(t>10)
					return true;
				else return false;
			}
			
		};
		System.out.println(p.test(10));
		
		//using lambda
		Predicate<Integer> p1=(data) -> data>10;
		System.out.println( p1.test(23));
	}

}
