/**
 * 
 */
package com.MultiThreading;

class Thread0 implements Runnable{
	Thread t;
	public void run() {
		System.out.println("Thread 1 completed !!!" + t.getName());
	}
}
class Thread4 implements Runnable {
	Thread t;
	public void run() {
		for( int i = 1 ; i <=5 ; i++) {
			System.out.println(i+" "+ t.getName());
			try {
			wait(7890);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread 2 completed !!!");
		//t.stop();
	}
}
class Thread5 implements Runnable{
	Thread t;
	public void run() {
		for( int i = 1 ; i <=5 ; i++) {
			System.out.println(i+" "+ t.getName());
		}
		t.resume();
		System.out.println("Thread 3 completed !!!");
	}
}
/**
 * @author HP
 *
 */

public class RunnableEx {

	public static void main(String[] args) {
		Thread0 t1 = new Thread0();
		t1.t = new Thread(t1,"thread-0");
		t1.t.start();
		Thread4 t4 = new Thread4();
		t4.t = new Thread(t4,"thread-1");
		t4.t.start();
		Thread5 t5 = new Thread5();
		t5.t = new Thread(t5,"thread-2");
		t5.t.start();
		t4.t.resume();
	//	t4.t.notify();
		
	}

}
