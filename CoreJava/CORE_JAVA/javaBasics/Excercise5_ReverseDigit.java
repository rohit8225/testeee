package com.javaBasics;
public class Excercise5_ReverseDigit {
public static void main(String[] args) {
	int n=456789;
	int rem,rev=0;
	
	while(0<n) {
		rem=n%10;
		n=n/10;
		rev=rem+rev*10;
		
		
	}
	System.out.println(rev);

	
}
}