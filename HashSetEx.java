/**
 * 
 */
package com.collectionsEx;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeSet;

/**
 * @author HP
 *
 */
public class HashSetEx {
	private static Scanner read = new Scanner(System.in);
	/**hash set implementation
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		HashSet<String> hashSet = new HashSet<String>();
//
//		// reading elements
//		do {
//			System.out.print("Enter the values : ");
//			String string = read.nextLine();
//			if(string.equals("-1")) {
//				break;
//			}
//			hashSet.add(string);
//		}while(true);
//		System.out.println(hashSet);
//		hashSet.iterator().forEachRemaining(System.out::println);
//		
//		LinkedHashSet<String> hashSet1 = new LinkedHashSet<String>();
//
//		// reading elements
//		do {
//			System.out.print("Enter the values : ");
//			String string = read.nextLine();
//			if(string.equals("-1")) {
//				break;
//			}
//			hashSet1.add(string);
//		}while(true);
//		System.out.println(hashSet1);
//		hashSet1.iterator().forEachRemaining(System.out::println);
		TreeSet<Float> treeSet = new TreeSet<Float>();

		// reading elements
		do {
			System.out.print("Enter the values : ");
			Float num = read.nextFloat();
			if(num == -1) {
				break;
			}
			treeSet.add(num);
		}while(true);
		System.out.println(treeSet);
		treeSet.iterator().forEachRemaining(System.out::println);
		System.out.println("ceiling : " +treeSet.ceiling(4.4f));
		System.out.println("floor : " +treeSet.floor(1.5f));
		treeSet.descendingSet().forEach(System.out::println);
		System.out.println(treeSet.headSet(2.2f));
		System.out.println(treeSet.tailSet(2.2f,true));
		System.out.println(treeSet.higher(2.2f));
		System.err.println(treeSet.lower(2.2f));
		
		System.out.println("\u001B[43m"+"\u001B[35m"+"Hi there how are you !!!:)");
		System.out.println(treeSet);
		
	}

}
