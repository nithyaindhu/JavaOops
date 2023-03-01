package com.oopsAbstraction;

public class Rectangle extends Shape{
	private int length;
	private int breadth;
	/**
	 * 
	 */
	protected Rectangle() {
		System.out.println("rectangle....");
	}
	/**
	 * @param length
	 * @param breadth
	 */
	protected Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	void area() {
		System.out.println("Area of rectangle : "+ length*breadth);
		
	}
	@Override
	void perimeter() {
		System.out.println("Perimeter of rectangle : "+ 2*(length + breadth));		
	}
	
}
