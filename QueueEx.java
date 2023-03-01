package com.collectionsEx;

import java.util.PriorityQueue;
import java.util.Scanner;

public class QueueEx {
	private static Scanner read = new Scanner(System.in);
	public static void main(String[] args) {
		PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
		do {
			System.out.print("Enter the values : ");
			int num = read.nextInt();
			if(num == -1) {
				break;
			}
			pqueue.add(num);
		}while(true);
		System.out.println(pqueue);
		//System.out.println(pqueue.offer(9));
		System.out.println(pqueue.toString());
		System.out.println("peek " +pqueue.peek());
		System.out.println("element "+pqueue.element());
		pqueue.stream().takeWhile(x->x>20).forEach(System.out::println);
		
	}

}
