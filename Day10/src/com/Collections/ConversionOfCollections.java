package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConversionOfCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>ls=new ArrayList<>();
		HashSet<Integer>set=new HashSet<>();
		ls.add(1);
		ls.add(2);
		ls.add(null);
		ls.add(3);
		System.out.println("the original list");
		System.out.println(ls);
		System.out.println("------------------------");
		
		//converting list to array
		Integer[]arr=new Integer[ls.size()];
		arr=ls.toArray(arr);
		System.out.println("list converted to array");
		 for (Integer x : arr) {
	            System.out.print(x + " ");
		 }
		 System.out.println();
		System.out.println("------------------------");
		
		//converting array to list
		//Type 1:
		Integer []a=new Integer[] {100,12,130,44};
		List<Integer>list=Arrays.asList(a);
		System.out.println(list);
		
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		
		ArrayList<Integer>list1=new ArrayList<>(set);
		System.out.println(list1);
		
		list1.addAll(set);
		System.out.println(list1);
	}

}
