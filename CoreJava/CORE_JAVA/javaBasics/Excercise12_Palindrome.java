package com.javaBasics;

public class Excercise12_Palindrome {
public static void main(String[] args) {
	
		int rev=0,rem,num=121 ,org=num;
		
		while(0<num) {
			
			rem = num%10;
			num = num/10;
			rev = rem+rev*10;
		}
		if(org==rev) {
			System.out.println("Number is Pallindrome");
		}else {
			System.out.println("Number is not Pallindrome");

		}
}
}
		//	System.out.print(rem+" ");
						//10+2=12//12*10=120+1=121
			//System.out.print(rev+" ");
			
		//	System.out.println(num+" ");
			//System.out.println();
	
