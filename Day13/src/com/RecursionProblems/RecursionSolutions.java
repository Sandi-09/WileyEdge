package com.RecursionProblems;

import java.util.Scanner;

public class RecursionSolutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int p1=function1(n,k);
		System.out.println(p1);
		
		int p2=function2(n);
		System.out.println(p2);
	}

	private static int function2(int n) {
		// TODO Auto-generated method stub
		if (n<=1)return n;
		else
		return function2(n-1)+function2(n-2);
	}

	private static int  function1(int n, int k) {
		// TODO Auto-generated method stub
		if(n==1)return 1;
		else 
			return (function1(n-1,k)+k)%n;
	}

}
