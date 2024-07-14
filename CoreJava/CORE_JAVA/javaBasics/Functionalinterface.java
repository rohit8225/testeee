package com.javaBasics;

@FunctionalInterface
public interface Functionalinterface {

 public int add(int a,int b);
 public static void multi(int a,int b) {
		System.out.println(a*b);
	}
	public default void sub(int a,int b) {
		System.out.println(a-b);
	}
}
