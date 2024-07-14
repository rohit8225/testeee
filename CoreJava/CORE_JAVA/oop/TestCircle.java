package com.oop;

public class TestCircle {

	public static void main(String[] args) {

		Shape s = new Circle(5);
		//s.setRadius(5);
		s.area();
		s.setBorderWidth(10);
		s.SetColor("red");
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
		//System.out.println(s.getRadius());

	}

}
