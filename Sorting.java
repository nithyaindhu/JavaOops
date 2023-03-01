/**
 * 
 */
package com.Genrics_assign;

import java.util.Arrays;

/**
 * @author HP
 *
 */
class Genrics{
	public <T extends Number> void bubbleSort(T[] array) {
		for(int i = 0; i<array.length-1; i++) {
			for(int j = 0; j<array.length-1-i; j++) {
				if(array[j].doubleValue()>array[j+1].doubleValue()) {
					T temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	public <T extends Number> void selectionSort(T[] array) {
		for(int i = 1; i<array.length-1; i++) {
			T temp = array[i];
			int j, flag = 0;
			for(j = i-1; j>=0; j--) {
				if(array[i].doubleValue()<array[j].doubleValue()) {
					flag = 1;
					array[i] = array[j];
					}
			}
			if(flag ==1) {array[j+1] = temp;}
		}
	}
	public <T extends Number> void displayArray(T[] array) {
		System.out.print("sorted array : ");
		if(((array.getClass().getName()).toString()).equals("[Ljava.lang.Integer;")) {
		Arrays.stream(array).forEach(x->System.out.print(+x.intValue()+" "));
		}
		else if(((array.getClass().getName()).toString()).equals("[Ljava.lang.Float;")) {
			Arrays.stream(array).forEach(x->System.out.print(+x.floatValue()+" "));
		}
		else if(((array.getClass().getName()).toString()).equals("[Ljava.lang.Double;")) {
			Arrays.stream(array).forEach(x->System.out.print(+x.doubleValue()+" "));
		}
			System.out.println();
	}
}
public class Sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Genrics genrics = new Genrics();
		Integer[] array = {1,3,2,5,4,8,6};
		Float[] arrayF = {1.1f,3.3f,2.2f,5.5f,4.4f,8.8f,5.5f};
		
		genrics.bubbleSort(array);
		genrics.displayArray(array);
		genrics.selectionSort(array);
		genrics.displayArray(array);
	
		genrics.bubbleSort(arrayF);
		genrics.displayArray(arrayF);
		genrics.selectionSort(arrayF);
		genrics.displayArray(arrayF);
	
	}

}
