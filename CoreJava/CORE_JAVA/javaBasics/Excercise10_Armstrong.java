package com.javaBasics;

public class Excercise10_Armstrong {
public static void main(String[] args) {
	int n=407,r,sum=0;
			int p=n;
	while(0<n) {
		r=n%10;
		n=n/10;
		sum=sum+(r*r*r);
	}
	//System.out.println(sum);
	if(sum==p) {
		System.out.println(sum +" Armstrong");
	}else {
		System.out.println("not Armstrong");
	}
}
}
