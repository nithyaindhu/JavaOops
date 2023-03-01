/**
 * 
 */
package com.MultiThreading;
interface A{
	void display();
}

/**
 * @author HP
 *
 */
public class InnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A() {
			public void display() {
				System.out.println("hi");
			}
		};
		a.display();
	}

}
