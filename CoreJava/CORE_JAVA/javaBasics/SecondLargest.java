package com.javaBasics;

public class SecondLargest {

	public static void main(String[] args) {

		int[] a = {100, 2000,10, 200, 145, 150, 160, 800, 60, 500 ,1000};
		int c = 0;
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			if (temp < a[i]) {
				c=temp;
				temp = a[i];
			}
			if (  a[i]<temp && c < a[i]  ) {
		
			c =a[i] ;
	

		}


		//System.out.println("-----------------");
		}
		System.out.println(c);
		}

}
