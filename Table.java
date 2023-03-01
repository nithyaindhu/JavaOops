/**
 * 
 */
package com.MultiThreading;
class TwoTable implements Runnable{
	Table t ;
	TwoTable(Table t){
		this.t = t;
	}
	@Override
	public void run() {
		t.printTable(" * ", 2);
		
	}
	
}
class ThreeTable implements Runnable{
	Table t ;
	ThreeTable(Table t){
		this.t = t;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		t.printTable(" * ", 3);
	}
	
}
/**
 * @author HP
 *
 */
public class Table {
	
	synchronized public void printTable(String str, int num) {
		for(int i  = 0 ; i < 5 ; i++) {
			System.out.println((i+1) + str + num + " = " + (num*(i+1)));
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Table table = new Table();
		ThreeTable table3 = new ThreeTable(table);
		Thread t = new Thread(table3);
		t.start();
		TwoTable table2 = new TwoTable(table);
		Thread t1 = new Thread(table2);
		t1.start();
	}
}
