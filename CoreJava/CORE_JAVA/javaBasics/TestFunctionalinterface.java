package com.javaBasics;

public class TestFunctionalinterface {

	public static void main(String[] args) {

		Functionalinterface f = new Functionalinterface() {
			

			public int add(int a, int b) {
				return a+b;
			}
		};
		
		//int a = f.add(10, 20);
		System.out.println(f.add(10, 20));
		Functionalinterface.multi(10, 5);
		f.sub(54,4);
		//System.out.println(a);
		
	}
	
}
