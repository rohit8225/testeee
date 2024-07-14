package com.javaBasics;

public class MaxNumberInArray {
	public static void main(String[] args) {
		int[] c = { 240, 80, 290, 190, 180, 40,1000 };
		int a, b;
		a = b = 0;
		for (int i = 0; i < c.length; i++) {
			if (a<c[i]) {
				b=a;
				a=c[i];
			}
		}
		System.out.println("First Highest Number is---- "+a);
		System.out.println("Second Highest Number is---- "+b);
	}
}
