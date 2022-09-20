package com.Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String>map=new HashMap<>();
	
	
		//set.add(9);
		map.put(0, "Sandipt");
		map.put(1, "Anand");
		map.put(2, "Lakhan");
		map.put(3, "Lakhan1");
		HashSet<Integer>set1=new HashSet<Integer>(map.keySet());
		set1.add(016);
		Integer r=10;
		System.out.println(r.toOctalString(016));
		
		for(Integer i:map.keySet()){
			System.out.println(i);
		}
		for(String s:map.values()){
			System.out.println(s);
		}
		System.out.println(map.entrySet());
//		for(Integer i:map.keySet()){
//			System.out.println(i);
//		}
//		for(Integer i:set) {
//			System.out.println(i);
//		}
		
		System.out.println(set1);
		

		
	}

}
