package Demo;

import java.util.Arrays;

public class IntArray {
	
	public static void main(String[] args) {
		String s1 = "2255";
		int[] i = new int[10];
		int count = 0;
		
		for(int k = 0 ; k<s1.length();k++) {
			
			if(Character.isDigit(s1.charAt(k))) {
				
				i[k]= Integer.parseInt(String.valueOf(s1.charAt(k)));
				count++;
			}
		}
		
		System.out.println(Arrays.toString(i));
		
		
		
	}

}
