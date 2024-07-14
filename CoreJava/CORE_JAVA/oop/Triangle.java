package com.oop;

public class Triangle extends Shape{
	private int base;
	private int height;
	
	public Triangle(int base, int height) {
		this.base=base;
		this.height=height;// TODO Auto-generated constructor stub
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public double area() {
		 double arr = base*height/2 ;
		 System.out.println("area of Triangle "+arr);
		 return arr;
		
	}
	

}
