package com.javaBasics;

public class GetIndex2ndClass {
 public static void main(String[] args) {
	int a[]= {10,20,30,40,50,70,100};
	int b=100;
	int e=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]==b) {
			e=i;
			//System.out.println("number of index="+e);
		}
			
	}
	System.out.println("number of index="+e);
}

}
