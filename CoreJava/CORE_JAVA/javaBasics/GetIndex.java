package com.javaBasics;

public class GetIndex {
	public static void main(String[] args) {
		int [] a= {10,20,30,40,50,70};
		int b=100;
		System.out.println(getInt(a,b));
	}
	public static int getInt(int [] c,int b) {
		int e=0;
		for(int i=0;i<c.length;i++) {
			if(b==c[i]) {
				e=i;
			}
		}
		if(e>0) {
			return e;
			
		}
		else {
			return e;
		}
	}
	
	/*
	 * public static void main(String[] args) { int [] a= {10,20,40,65,70,100}; int
	 * b=40; int index=-1; for (int i=0;i<a.length;i++) { if(a[i]==0) { index=i; } }
	 * System.out.println("Numnber of index"+index);
	 * 
	 * }
	 */
}
