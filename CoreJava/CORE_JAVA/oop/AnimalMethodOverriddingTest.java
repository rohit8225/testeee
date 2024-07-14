package com.oop;

public class AnimalMethodOverriddingTest {

	public static void main(String[] args) {

		Animal a = new Animal();
		Dog b = new Dog();
		//Animal c = new Dog();


		a.move();

		b.move();
		//c.move();
		
	}

}
