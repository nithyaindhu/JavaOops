/**
 * 
 */
package com.oopsInheritance;

/**
 * @author HP
 *
 */
class A{
	void display()
	{
		System.out.println("i am from class A display ");
	}
	void display(int a)
	{
		System.out.println("i am from class A display " + a + " parameter");
	}
}
class B extends A{
	void display()
	{
		System.out.println("i am from class B display ");
	}
	void display1(int a)
	{
		System.out.println("i am from class B display " + a + " parameter");
	}
}



public class Overloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.display();
		a.display(1);
		A ab = new B();
		ab.display();
//		ab.display1(1); // error
		B b = new B();
		b.display();
		b.display(1);
		//B ba = (B) new A(); // error
		B ba = (B) ab; 
		//B ba = (B) a; // error
		ba.display();
		ba.display(1);
		
	}

}
