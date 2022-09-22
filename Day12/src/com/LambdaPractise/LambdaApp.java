package com.LambdaPractise;

public  class LambdaApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaApp Lapp=new LambdaApp();
		//without lambda,using anonymous class
		FunctionalTesting ft=new FunctionalTesting() {
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("hey iam new to lambdas");
				
			}
			
		};
		ft.print();
		
		//anonymous class using argumentrs
		FunctionalTesting ft1=(new FunctionalTesting() {
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("hey iam new to lambdas and passed this in arguments");
				
			}
		});
		ft1.print();
		
		//lambda expression
		FunctionalTesting ft4=()->{System.out.println("final lambda expression is soo cool");};
		ft4.print();
		
		AddInterface add=(a,b)->{return a+b;};
		System.out.println(add.mathematicalCalculation(4,10));
		
		
	}

//	@Override
//	public void print() {
//		// TODO Auto-generated method stub
//		
//	}


}
