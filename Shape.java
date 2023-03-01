/**
 * 
 */
package com.oopsAbstraction;

/**
 * @author HP
 *
 */
public abstract class Shape {
	Shape(){
		System.out.println("drawing....");
	}
	public void draw() {
		System.out.println("drawing shape....");
	}
	abstract void area();
	abstract void perimeter();
}
