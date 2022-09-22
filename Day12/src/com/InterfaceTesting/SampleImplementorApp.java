package com.InterfaceTesting;

public class SampleImplementorApp implements SampleImplementor{
public  static void main(String args[]) {
	SampleImplementorApp sample=new SampleImplementorApp();
	sample.add();
	sample.hello();
	int x=SampleImplementor.counter();
	System.out.println(x);
}

@Override
public void add() {
	// TODO Auto-generated method stub
	System.out.println("in the main app");
}

//default methods can be overriden (we dont need to write default keyword)

@Override 
public void hello() {
	System.out.println("hi");
}
}
