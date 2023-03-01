/**
 * 
 */

package com.oops;
import java.util.Scanner;
/**
 * @author HP
 *
 */
public class CheckingCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		Circle c = new Circle();
		System.out.print("Enter radius : ");
		c.set_radius(read.nextDouble());
		read.nextLine();
		System.out.print("Enter color : ");
		c.set_color(read.nextLine());
		System.out.println(c);
		
		Circle c1 = new Circle(5,"green");
		System.out.println(c1);
		
		
		read.close();
	}

}
