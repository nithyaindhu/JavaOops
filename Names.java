/**
 * 
 */
package com.CollectionAssignments;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @author HP
 *
 */
class Person{
	String name;
	public String str;
}
public class Names {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		//asking user how many names he want to enter
//		Scanner read = new Scanner (System.in);
////		System.out.print("Enter the no of Names : ");
////		int times = read.nextInt();
////		String[] nameArray = new String[times];
////		
//		ArrayList<String> nameList = new ArrayList<String>();
//		System.out.println("Enter the names or enter -1 to exit : ");
//		String name;
//		do {
//			name = read.nextLine();
//			if(name.equals("-1")) {
//				break;
//			}
//			else {
//				nameList.add(name);
//			}
//		}while(true);
//		// printing name whose length is greater than 5
//		nameList.stream().filter(x -> x.length() >= 5).forEach(x->System.out.println(x)/* System.out::println */);
//		read.close();
		
		String s1 = "hi";
		String s2 = new String( "hi");
		String s3 = new String( "hi");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s2));
		System.out.println(s1+ " " +s2);

		System.out.println(s1.hashCode()+ " " +s2.hashCode());
		System.out.println("___________________");
		Person p1 = new Person();
		Person p2 = new Person();
		p1.name = "nithya";
		p2.name = "nithya";
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1+ " " +p2);

		System.out.println(p1.hashCode()+ " " +p2.hashCode());
		System.out.println("__________________");
		Integer i1 = 5;
		Integer i2 = 5;
		Integer i3 = new Integer(5);
//		Integer.v
//		i3.in
		System.out.println(i1==i3);
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode() + " "+ i2.hashCode());
		System.out.println("__________________");
		
	}

}
