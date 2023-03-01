/**
 * 
 */
package com.collectionsEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author HP
 *
 */
public class CollectionEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		List<String> arrayList = new ArrayList<String>();
		do {
			System.out.print("Enter the values : ");
			String str = read.nextLine();
			if(str.equals("-1")) {
				break;
			}
			arrayList.add(str);
		}while(true);
		arrayList.iterator().forEachRemaining(System.out::println);
		System.out.println(arrayList);
		System.out.println(arrayList.size());
//		System.out.println(arrayList.set(2, "?"));
//		System.out.println(arrayList.set(5, "?"));
		System.out.println(arrayList);
//		System.out.println(arrayList.get(arrayList.lastIndexOf("?")));
//		System.out.println(arrayList.get(arrayList.indexOf("?")));
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		List<String> secondList = new ArrayList<String>();
		secondList.addAll(arrayList);
		System.out.println(secondList);
		arrayList = arrayList.stream().filter(x->x.length()>=5).collect(Collectors.toList());
//		secondList.forEach(System.out::print);
//		System.out.println();
//		secondList.remove(0);
//		System.out.println(secondList.spliterator().characteristics());
//		secondList.listIterator().forEachRemaining(x->{
//			x+="hi";
//		});
//		secondList.removeIf(x-> x.equals("hi"));
//		secondList.forEach((System.out::print));
//		System.out.println();
//		arrayList.forEach((System.out::print));
//		System.out.println(arrayList.retainAll(secondList));
//		System.out.println();
//		arrayList.forEach(System.out::println);
//		System.out.println(arrayList.subList(0, 3));
//		arrayList.removeIf(x->x.equals("hi"));
//		System.out.println(arrayList.equals(secondList));
		secondList.clear();
		secondList.add("ni");
		secondList.retainAll(arrayList);
		secondList.forEach(x->System.out.println("hi "+x));
		}

}
