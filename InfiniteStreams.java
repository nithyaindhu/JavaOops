/**
 * 
 */
package com.streams;

import java.util.stream.Stream;

/**
 * @author HP
 *
 */
public class InfiniteStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// from 1 to 50 it will filter / by 5
		Stream<Integer> infinite = Stream.iterate(1,n->(n+1)).limit(50).filter(x->x%5==0);
		infinite.forEach((i)->System.out.println(i));
		System.out.println("+++++++++++++++");//predicate x->x%5==0
		Stream<Integer> infinite1 = Stream.iterate(1,n->(n+1)).filter(x->x%5==0).limit(50);
		infinite1.forEach((i)->System.out.println(i));
	}

}
