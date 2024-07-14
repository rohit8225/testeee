package com.oopVip;

//Shallow Cloning
public class BankAccount implements Cloneable{

	public double balance = 0;
		
	public BankAccount(double b) {
	
		this.balance = b;
	}

public Object clone() throws CloneNotSupportedException {
	return super.clone();
}	
}
