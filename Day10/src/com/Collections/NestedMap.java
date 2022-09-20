package com.Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class NestedMap{
	public static void main(String args[]) {

		
		Map<Integer, Map<String, String>> map1 = new HashMap<Integer, Map<String,String>>();
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("Father", "SRK");
		map1.put(1, map2);
		map2.put("Mother", "Kajol");
		map1.put(2, map2);
//		map2.remove("Father");
//		map1.remove(1);
	     Iterator<Entry<Integer, Map<String, String>>> iter= map1.entrySet().iterator();
	     //hasNext executes until next throws an exception
	     while(iter.hasNext()) {
	    	 System.out.println("Value inside iterator loop is | Print Statement 1 " + iter.next());
	    	 map1.remove(1);
	    	 iter= map1.entrySet().iterator();
	    	 System.out.println("Value inside iterator loop is | Print Statement 2 " + iter.next());
	     }
//		for(Integer s: map1.keySet()) {
//			if(s==1) {
//				System.out.println(s);
//				map1.remove(s);
//				System.out.println(map1.get(s));
//			}
//			else System.out.println("Else got executed");
//			System.out.println(map1.get(s));
//		}
//		System.out.println(map2);
		System.out.println("Map 1 print statement " + map1);
//		map2.put("Brother", "Sandipt");
//		System.out.println(map1);
		
	}
}
