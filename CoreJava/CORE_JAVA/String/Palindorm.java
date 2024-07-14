package com.String;

public class Palindorm {

	public static void main(String[] args) {
		String mystring = "DAD";
		StringBuffer S = new StringBuffer(mystring);
		StringBuffer r1 = S.reverse();
//String s =S.toString();
		//if (mystring.equals(r1)) {
		System.out.println(r1);
			System.out.println("string is palindrome");

		//} else {
			System.out.println("string is not palindrome");
		}
	}
//}
