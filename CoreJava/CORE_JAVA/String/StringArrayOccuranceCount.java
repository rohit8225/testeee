package com.String;

public class StringArrayOccuranceCount {
public static void main(String[] args) {
	String[] s= {"rohit" ,"patidarrr" };
	int count=0;
	for(String str:s) {
		
		for (char a='a';a<='z';a++) {
			for(int i=0;i<str.length();i++) {
				if(a==str.charAt(i)) {
					count++;
				}
			}
			if(count > 0) {
				System.out.println(count+"="+a);
				count = 0;
			}
			
		}
	}
}
}
