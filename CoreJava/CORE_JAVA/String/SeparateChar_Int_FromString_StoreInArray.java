package com.String;

import java.util.Arrays;

public class SeparateChar_Int_FromString_StoreInArray {

	public static void main(String[] args) {
		String s="Rohit22patidar12345";
		char [] ch=s.toCharArray();
		String x="";
		/* String y=""; */
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				x=x+ch[i];
			}
		}	
		
		
		char []a=x.toCharArray();
		
			System.out.println(Arrays.toString(a));
			
		
	}
}
