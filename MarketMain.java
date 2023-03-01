/**
 * 
 */
package com.CollectionAssignments;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author HP
 *
 */
class SortById implements Comparator<Market>{

	@Override
	public int compare(Market o1, Market o2) {
		return o1.getId()-o2.getId();
	}	
}
class SortByName implements Comparator<Market>{

	@Override
	public int compare(Market o1, Market o2) {
		return o1.getName().compareTo(o2.getName());
	}	
}
class SortByPrice implements Comparator<Market>{

	@Override
	public int compare(Market o1, Market o2) {
		return o1.getPrice().compareTo(o2.getPrice());
	}	
}
class SortByCategory implements Comparator<Market>{

	@Override
	public int compare(Market o1, Market o2) {
		return o1.getCategory().compareTo(o2.getCategory());
	}	
}

class Market implements Comparable<Market>{
	private int id;
	private String name;
	private String price;
	private String category;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param i the id to set
	 */
	public void setId(int i) {
		this.id = i;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	
	

	@Override
	public String toString() {
		return "Market [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}

	
	@Override
	public int compareTo(Market o) {
		// TODO Auto-generated method stub
		//return this.name.compareTo(o.name);
		return this.id-o.getId();
	}
	

}
public class MarketMain{
		public static void main(String[] args) {
			Random random= new Random();
			ArrayList<Market> list = new ArrayList<Market>();
			try {
				Scanner read = new Scanner( new FileReader("D:\\Jamocha\\java\\CatalogItem.csv"));
				//read.useDelimiter(",");
				int count = 0;
				Market market = new Market();
				
				while(read.hasNext()) {
					String line;
					System.out.println(line = read.nextLine());
					Scanner read1 =  new Scanner(line);
					read1.useDelimiter(",");
					count++;
					
					switch(count) {
					case 1:
						market.setId(Integer.parseInt(read1.next()));
						count++;
					case 2:
						market.setName(read1.next());
						count++;
					case 3:
						market.setPrice(read1.next());
						count++;
					case 4:
						market.setCategory(read1.next());
						list.add(market);
						count = 0;
						market = new Market();
					}
				}
			} catch (FileNotFoundException e) {
				System.out.println(e);
			}
		//		try {
		//			Scanner read = new Scanner( new FileReader("D:\\Jamocha\\java\\CatalogItem.csv"));
		//			//read.nextLine();
		//			read.useDelimiter(",");
		//			int count = 0;
		//			Market market = new Market();
		//			
		//			while(read.hasNext()) {
		//				String line;
		//				System.out.println(line = read.next());
		//				count++;
		//				
		//				switch(count) {
		//				case 1:
		//					market.setId(/* random.nextInt(10) */Integer.parseInt(line));
		//					break;
		//				case 2:
		//					market.setName(line);
		//					break;
		//				case 3:
		//					market.setPrice(line);
		//					break;
		//				case 4:
		//					market.setCategory(line);
		//					list.add(market);
		//					count = 0;
		//					market = new Market();
		//					break;
		//				}
		//			}
		//		} catch (FileNotFoundException e) {
		//			System.out.println(e);
		//		}
			Collections.sort(list);
			list.forEach(System.out::println);
			Collections.shuffle(list);
			System.out.println("Without sorting : ");
			list.forEach(System.out::println);
			
			
		//		System.out.println("Sorted by id : ");
		//		Collections.sort(list,new SortById());
		//		list.forEach(System.out::println);
		//		
		//		
		//		System.out.println("Sorted by name : ");
		//		Collections.sort(list,new SortByName());
		//		list.forEach(System.out::println);
		//		
		//		
		//		System.out.println("Sorted by price : ");
		//		Collections.sort(list,new SortByPrice());
		//		list.forEach(System.out::println);
		//		
		//		
		//		System.out.println("Sorted by Category : ");
		//		Collections.sort(list,new SortByCategory());
		//		list.forEach(System.out::println);
		
		}

}
