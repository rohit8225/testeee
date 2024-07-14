package com.String;

public class RohitString {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("rohit patidar");
		int count = 0;
		String s = sb.toString();
		
		for (char a = 'a'; a < 'z'; a++) {
			for (int i = 0; i < s.length(); i++) {
				/*
				 * char ch = s.charAt(i); if (ch == a)
				 */ 
				if (s.charAt(i)==a){
					count++;
					
				}
			}
			if(count != 0) {
				System.out.println(a +"="+count);
				count = 0;
			}
			
		}
	}
}
