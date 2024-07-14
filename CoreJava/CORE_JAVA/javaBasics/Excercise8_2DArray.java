package com.javaBasics;

public class Excercise8_2DArray {
	public static void main(String[] args) {

		int[][] a = new int[10][10];
		int c ;
		for (int i = 0; i <a.length; i++) {
			for (int j = 2; j <=a[i].length; j++) {
				c = (i + 1) * j;
				System.out.print(c + "\t");
			}
			System.out.println();
		}
	}
	/*
	 * System.out.println(
	 * "----------------------------------------------------------------"); int[][]
	 * t = new int[10][9]; int i = 0; while (i < t.length) { int j = 0; while (j <
	 * t[i].length) {
	 * 
	 * System.out.print((i + 1) * (j + 2) + "\t");
	 * 
	 * j++; } System.out.println(); i++;
	 * 
	 * } }
	 */

}
