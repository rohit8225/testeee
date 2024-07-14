package com.String;

public class DuplicareCharacterRemove {
	public static void main(String[] args) {
		String s="aaabbccccddee";
		int	count=0;

	char ch[]=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
		
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]&&ch[i]!=' ') {
					count++;
					ch[j]='0';
					
				}
			}
			if(count!=0&&ch[i]!='0') {
				System.out.print(ch[i]);
			}
		}
	}
}
