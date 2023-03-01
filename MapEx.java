/**
 * 
 */
package com.collectionsEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * @author HP
 *
 */
class MyBiConsumer implements BiConsumer<String, Integer> {
	static String maxk = "A";
	static String mink = "z";
	
	static int maxv = 0;
    public void accept(String k, Integer v)
    {
        System.out.println("Key: " + k
                           + "\tValue: " + v);
        
        if(k.compareTo(maxk)>0) {
        	
        	maxk = k;
        }
        if(k.compareTo(mink)<0) {
        	mink = k;
        }
        if(v>maxv) {
        	maxv = v;
        }
  
    }
}
public class MapEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
		hashMap.put("Y", 1);
		hashMap.put("B", 2);
		hashMap.put("a", 3);
		hashMap.put("C", 4);
		hashMap.put("A", 5);
		hashMap.put("F", 6);
		System.out.println(hashMap);
		Set<Map.Entry<String,Integer>> set = hashMap.entrySet();
		for(Map.Entry<String,Integer> map : set) {
			System.out.println(map.getKey()+ " : "+ map.getValue());
		}
		System.out.println("size is "+hashMap.size());
		System.out.println(hashMap.containsKey("j"));
		System.out.println(hashMap.containsValue(3));
		System.out.println(hashMap.get("C"));
		
		
		String string = "Hi there how are you i am good What ablout you";
		//HashMap<String,Integer> hashMap1 = new HashMap<String,Integer>();
		char[] arr = string.toCharArray();
//		for(Character a : arr) {
//			if(!(a == ' ')) {
//				hashMap1.put(a.toString(), hashMap1.containsKey(a.toString())?hashMap1.get(a.toString())+1:1);
//			}
////		}
//		Set<Map.Entry<String,Integer>> set1 = hashMap1.entrySet();
//		for(Map.Entry<String,Integer> map : set1) {
//			System.out.println(map.getKey()+ " : "+ map.getValue());
//		}

		HashMap<Character,Integer> hashMap1 = new HashMap<Character,Integer>();
		for(Character a : arr) {
			hashMap1.put(a, hashMap1.containsKey(a)?hashMap1.get(a)+1:1);
			//hashMap1.pu
		}
		Set<Map.Entry<Character,Integer>> set1 = hashMap1.entrySet();
		for(Map.Entry<Character,Integer> map : set1) {
			System.out.println(map.getKey()+ " : "+ map.getValue());
		}
		
		
		hashMap.compute("Z", (k,v)->(v==null)? 1:v+(5));
		Set<Map.Entry<String,Integer>> set2 = hashMap.entrySet();
		for(Map.Entry<String,Integer> map : set2) {
			System.out.println(map.getKey()+ " : "+ map.getValue());
		}
		
		hashMap.entrySet().forEach(System.out::println);
		BiConsumer<String,Integer> biConsumer = new MyBiConsumer();
		hashMap.forEach(biConsumer);
		//hashMap.forEach(biConsumer);
		System.out.println("Max value : "+MyBiConsumer.maxv);
		System.out.println("Max key " +MyBiConsumer.maxk);
		System.out.println("Value of Max key " +hashMap.get(MyBiConsumer.maxk));
		System.out.println("Min key " +MyBiConsumer.mink);
		System.out.println("Value of Min key " +hashMap.get(MyBiConsumer.mink));
		
		System.out.println(hashMap.entrySet().stream().max((x,x1)->(x.getValue()>=x1.getValue())?1:-1).get().getValue());
		System.out.println(hashMap.entrySet().stream().max((x,x1)->(x.getValue()>=x1.getValue())?1:-1).get().getKey());
		System.out.println(hashMap.entrySet().stream().max((x,x1)->(x.getKey().compareTo(x1.getKey())>=0)?1:-1).get().getKey());
		
	}

}
