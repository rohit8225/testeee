package com.javaBasics;

public class Excercise13_Harmonic {
	public static void main(String[] args) {

		System.out.println("----------ForLoop---------");
		int n = 5;
		double r = 0.0;
		for (int i =1; i <= n; i++) {
			r = r + (double) 1 / i;
			System.out.println(r);
		}

//		for (int i = n; i > 0; i--) {
//			r = r + (double) 1 / n;
//			n--;
//			System.out.println(r);
//		}
//		1/1 + 1/2 + 1/3 + 1/4 + 1/5
		
		System.out.println("----------WhileLoop---------");
		
		  int num = 5; double result = 0.0;
		  
		  while (num > 0) { result = result + (double) 1 / num; num--;
		  System.out.println(result); }
		 
	}
}