package com.String;

public class OccurenceOfAnyOneLetterInString {
	public static void main(String[] args) {
		String name = "Neeraj";
		
		int a = 0;
		for(int i = 0; i<name.length(); i++) {
			char c = name.charAt(i);
			
			String k = name.valueOf(c);
			
			if(k.matches("e")) {
				a++;
			}
		}
		System.out.println(a);
	}

}
