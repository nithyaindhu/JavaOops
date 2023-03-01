/**
 * 
 */
package com.oopsAbstraction;
import java.util.Scanner;
/**
 * @author HP
 *
 */
public class CheckingShape {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read  = new Scanner (System.in);
		Shape shapeCircle = new Circle(3);
		Shape shapeSquare = new Square(5);
		Shape shapeRectangle = new Rectangle(5,5);
		
		shapeCircle.draw();
		shapeCircle.area();
		shapeCircle.perimeter();
		shapeSquare.draw();
		shapeSquare.area();
		shapeSquare.perimeter();
		shapeRectangle.draw();
		shapeRectangle.area();
		shapeRectangle.perimeter();
		read.close();
	}

}
