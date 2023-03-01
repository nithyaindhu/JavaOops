/**
 * 
 */
package com.oopsAbstraction;

/**
 * @author HP
 *
 */
public class Circle extends Shape {
	private int radius;
	
	Circle(){
		System.out.println("circle....");
	}
	public Circle(int radius){
		this.radius = radius;
	}
	@Override
	void area() {
		
		System.out.println("Area of circle : "+ (22/7)*radius*radius);
	}

	@Override
	void perimeter() {
		System.out.println("Perimeter of circle : "+ (2*(22/7)*radius));
		
	}

}
