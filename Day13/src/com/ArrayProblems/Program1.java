package com.ArrayProblems;

import java.util.HashSet;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefga";
		if(unique(s)) 
			System.out.println("Unique chars not present");
			else
				System.out.println("Unique chars  present");
		
	}

	private static boolean unique(String s) {
		// TODO Auto-generated method stub
		HashSet<Character> ch=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ')continue;
			if(ch.contains(s.charAt(i)))return false;
			ch.add(s.charAt(i));
		}
		return true;
	}

}
