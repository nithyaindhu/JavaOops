/**
 * 
 */
package com.collectionsEx;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author HP
 *
 */
public class LinkedlistEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		LinkedList<Integer> linkedListOne = new LinkedList<Integer>();
		do {
			System.out.print("Enter the values : ");
			int num = read.nextInt();
			if(num == -1) {
				break;
			}
			linkedListOne.add(num);
		}while(true);
		linkedListOne.descendingIterator().forEachRemaining(System.out::println);
		//using iterator
		Iterator<Integer> iterator = linkedListOne.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		// adding at first index
		linkedListOne.addFirst(0);
		//adding at last index
		linkedListOne.addLast(-1);
		//printing list
		System.out.println(linkedListOne);
		// adding all elemets from specified index
		System.out.println(linkedListOne.addAll(3, linkedListOne));
		//printing
		System.out.println(linkedListOne);
		//iterating in descening order
		linkedListOne.descendingIterator().forEachRemaining(x->System.out.print(x+" "));
		System.out.println();
		//cloning and save it to another list by type casting it
		LinkedList<Integer> linkedListTwo = new LinkedList<Integer>();
		linkedListTwo = (LinkedList<Integer>) linkedListOne.clone();
		linkedListTwo.removeIf(x->x==1);
		//print list 1 and 2
		System.out.println(linkedListOne);
		System.out.println(linkedListTwo);
		//checks if list one  has contains all elements which is in list 2
		System.out.println(linkedListOne.containsAll(linkedListTwo));
		//checks if list two  has contains all elements which is in list 1
		System.out.println(linkedListTwo.containsAll(linkedListOne));
		//return 1 st element
		System.out.println(linkedListOne.element());
		System.out.println(linkedListOne.poll());
		System.out.println(linkedListOne);
		System.out.println(linkedListOne.pollFirst());
		System.out.println(linkedListOne);
		System.out.println(linkedListOne.pollLast());
		System.out.println(linkedListOne);
		System.out.println(linkedListOne.pop());
		System.out.println(linkedListOne);
		linkedListOne.push(9);
		System.out.println(linkedListOne);
		System.out.println(linkedListOne.pop());
		System.out.println(linkedListOne);
		Object[] arr = linkedListOne.toArray();
		
	
	}

}
