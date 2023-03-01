/**
 * 
 */
package com.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author HP
 *
 */
public class CollectionStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection<String> collection = Arrays.asList("nithya","nasir","nalini","shalini","abarna","hari");
		Stream<String> soc = collection.stream();
//		List<String> list = soc.filter(x->(x.startsWith("n"))).collect(Collectors.toList());
//		list.forEach(x->System.out.println(x));
//		System.out.println(list);
		List<String> list1 = soc.filter(x->x.indexOf(0)=='n').collect(Collectors.toList());
		list1.forEach(x->System.out.println(x));
		System.out.println(list1);
	}

}
