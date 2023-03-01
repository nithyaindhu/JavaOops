/**
 * 
 */
package com.oopsAbstraction;

/**
 * @author HP
 *
 */
public class Square extends Shape {
	private int side;

	/**
	 * 
	 */
	protected Square() {
		System.out.println("square....");
	}

	/**
	 * @param side
	 */
	protected  Square(int side) {
		this.side = side;
	}

	@Override
	void area() {
		System.out.println("Area of square : "+ side*side);
	}

	@Override
	void perimeter() {
		System.out.println("Perimeter of square : "+ 4*side);
	}
	
	
}
