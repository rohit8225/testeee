package com.String;

public class StringSameCountOccurances {
	public static void main(String[] args) {
		String s1="Roooohit";
		 int count=0; 
		char[]ch= s1.toCharArray();
		for(char s:ch) {
			for(int i=0; i<ch.length; i++) {
				if(ch[i]==s) {
				count++;
			}
		}
		System.out.println(s+"="+count);
		count=0;
		
		/*
		 * char [] s1=s.toCharArray(); System.out.println(s1);
		 */
		
	}
	}

}
