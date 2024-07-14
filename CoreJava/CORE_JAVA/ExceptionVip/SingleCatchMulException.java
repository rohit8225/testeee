package com.ExceptionVip;

public class SingleCatchMulException {

	public static void main(String[] args) {
		
		String s = "vipin";
		
		try {
			System.out.println(s.charAt(8));
		} catch (NullPointerException|StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
