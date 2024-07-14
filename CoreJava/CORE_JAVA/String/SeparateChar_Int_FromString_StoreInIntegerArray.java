package com.String;

import java.util.Arrays;

public class SeparateChar_Int_FromString_StoreInIntegerArray {
public static void main(String[] args) {
	String s="Rohit12345";
	int [] num =new int [s.length()];
	for(int i=0;i<s.length();i++) {
		if (Character.isDigit(s.charAt(i))) {
		num[i]=	Integer.parseInt(String.valueOf(s.charAt(i)));
				
			
		}
	}
	for(int b:num) {
		if(b!=0) {
			System.out.println(b);
		}
	}
	
}
}
