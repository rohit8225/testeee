package com.String;

public class SeparateStringFromIntergerandtotalintegercount {
	public static void main(String[] args) {
		
	
		/*
		 * String name="Neer12a69j"; String result = ""; int count = 0; int num = 0 ;
		 * 
		 * char[] ch = name.toCharArray(); for(int i=0; i<ch.length; i++) {
		 * if(!Character.isDigit(ch[i])) { result = result + ch[i]; }else { count++;
		 * 
		 * } } System.out.println(result); System.out.println(count);
		 */
		String [] s= {"Rohitpatidar222"};
		int count=0;
		for(String a:s) {
			char[] ch=a.toCharArray();
			for(int i=0;i<ch.length;i++) {
				if(Character.isDigit(ch[i])) {
					count +=Integer.parseInt(String.valueOf(ch[i]));
				}
			}
			System.out.println(count);
			}
		/* System.out.println(count); */
}
}