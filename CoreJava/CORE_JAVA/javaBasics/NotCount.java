package com.javaBasics;

public class NotCount {
	public static void main(String[] args) {
		int[] a = { 2000, 1000, 500, 200, 100, 50 };
		int b = 4550;
		int r = 0;
		for (int i = 0; i < a.length; i++) {
			r = b / a[i];
			b = b % a[i];
			if (r > 0) {

				System.out.println(a[i] + "=" + r);
				
			}
		}
	}

}
