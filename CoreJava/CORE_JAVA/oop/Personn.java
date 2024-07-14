package com.oop;

public class Personn {

	String firstname;
	String lastname;
	String address;

	public Personn() {
		System.out.println("this is default constructor");
	}

	public Personn(String firstname, String Lastname) {
		this.firstname = firstname;
		this.lastname = Lastname;
		System.out.println("same class");
	}

	public Personn(String Firstname, String Lastname, String add) {
		this(Firstname, Lastname);
		this.address = add;
		System.out.println("calling constructor from same class");
	
	}
	
	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getAddress() {
		return address;
	}

	public static void main(String[] args) {
		
		 Personn p = new Personn("Rohit","Patidar", "Indore");
	
		 System.out.println(p.getFirstname());
		 System.out.println(p.getLastname());
		 System.out.println(p.getAddress());
	}
}