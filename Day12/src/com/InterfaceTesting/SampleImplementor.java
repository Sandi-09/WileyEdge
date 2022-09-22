package com.InterfaceTesting;

public interface SampleImplementor {
public void add();
public default void hello() {
	System.out.println("hey how are you");
}
public static int counter() {
	return 12;
}
}
