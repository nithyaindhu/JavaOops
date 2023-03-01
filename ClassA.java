/**
 * 
 */
package com.MultiThreading;

class Thread1 extends Thread {
	public void run() {
		for( int i = 1 ; i <=5 ; i++) {
			if(i == 3) {
				//yield();
				suspend();
			}
			System.out.println("Therad 1 : "+ i +" "+getName());
		}
		System.out.println("Thread 1 completed !!!");
	}
}
class Thread2 extends Thread{
	public void run() {
		for( int i = 1 ; i <=5 ; i++) {
//			if(i == 3) {
//				try {
//					Thread.sleep(1002);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				//yield();
//			}
			System.out.println("Therad 2 : "+ i +" "+getName());
		}
		System.out.println("Thread 2 completed !!!");
	}
}
class Thread3 extends Thread {
	public void run() {
		for( int i = 1 ; i <=5 ; i++) {
//			if(i == 3) {
//				//yield();
//			}
			System.out.println("Therad 3 : "+ i +" "+getName());
		}
		System.out.println("Thread 3 completed !!!");
	}
}
/**
 * @author HP
 *
 */
public class ClassA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();

		System.out.println(t1.getId());
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		t1.setPriority(6);
		t2.setPriority(7);
		t3.setPriority(6);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		t1.start();
		t2.start();
		t1.resume();
		t3.start();

	}

}
