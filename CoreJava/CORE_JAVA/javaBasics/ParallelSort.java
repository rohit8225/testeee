package com.javaBasics;

import java.util.Arrays;

public class ParallelSort {
	
	public static void main(String[] args) {
		int []a= {40,10,20,50,30};
		
		for (int i = 0; i <a.length; i++) {
			Arrays.parallelSort(a);
			System.out.println(a[i]);	
		}
		
	}

}
