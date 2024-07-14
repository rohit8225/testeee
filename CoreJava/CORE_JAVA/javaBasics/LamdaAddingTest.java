package com.javaBasics;

public class LamdaAddingTest {
	public static void main(String[] args) {
		Functionalinterface f = (a,b) -> {return(a+b);};
		//int a=5;
		//int b=10;
		f.sub(55, 5);
		System.out.println(f.add(10, 5));
		Functionalinterface.multi(10, 5);
	}

}
