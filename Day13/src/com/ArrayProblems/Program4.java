package com.ArrayProblems;

import java.util.Arrays;
import java.util.HashSet;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,8,66,8};
		Arrays.sort(a);
		//method 1
		for(int i=1;i<a.length;i++) {
			if(a[i]==a[i-1]) {
				System.out.println("Mathching elements found 1");
				break;
			}
		}
		//method 2
		HashSet<Integer>set=new HashSet<>();
		for(Integer arr:a) {
			set.add(arr);
		}
		if(set.size()!=a.length)System.out.println("Mathching elements found 2");
	}

}
