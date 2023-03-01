/**
 * 
 */
package com.CollectionAssignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author HP
 *
 */
public class FruitPrice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		Map <String,Double> fruitPrice = new HashMap<String,Double>();
		
		for(int i = 0; i<4; i++) {
			System.out.print("Enter the fruit name : ");
			String name = read.nextLine();
			System.out.print("Enter the fruit price : ");
			double price = read.nextDouble();
			read.nextLine();
			fruitPrice.put(name,price);
		}
		Set<Map.Entry<String,Double>> fruitSet = fruitPrice.entrySet();
		for(Map.Entry<String, Double> fruits : fruitSet) {
			System.out.println(fruits.getKey() + " : "+ fruits.getValue());
		}
		fruitPrice.entrySet().iterator().forEachRemaining(System.out::println);
		Iterator<Map.Entry<String,Double>> iterator = fruitSet.iterator();
		while(iterator.hasNext()) {
			String string;
			string = iterator.next().getKey();
			System.out.println(string +" "+ fruitPrice.get(string) );
		}
		System.out.println("orange : "+ fruitPrice.get("orange"));
		if(fruitPrice.entrySet().stream().anyMatch(x->x.getKey().equalsIgnoreCase("apple"))) {
			System.out.println("apple: "+ fruitPrice.get("apple"));			
		}
		else {
			System.out.println("not Exist!!!");
			
		}
	}

}
