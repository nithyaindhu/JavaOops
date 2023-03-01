/**
 * 
 */
package com.MultiThreading;

import java.util.Random;

class ThreadOne1 implements Runnable{
	Random r = new Random();
	int num = r.nextInt(10) ;
	Thread t;
	@Override
	public void run() {
		System.out.println("num is "+ (num ));
		
	}
	
}
class ThreadTwo1 implements Runnable{
	int num;
	ThreadTwo1(int num){
		this.num = num;
	}
	Thread t;
	@Override
	public void run() {
		
		System.out.println(num*num);
	}
	
}
class ThreadThree1 implements Runnable{
	int num;
	ThreadThree1(int num){
		this.num = num;
	}
	Thread t;
	@Override
	public void run() {
		
		System.out.println(num*num*num);
	}
	
}
/**
 * @author HP
 *
 */
public class ThreeThreadsInMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadOne1 t1 = new ThreadOne1();
		t1.t = new Thread(t1);
		t1.t.start();
		if(t1.num %2 == 0) {
			ThreadTwo1 t2 = new ThreadTwo1(t1.num);
			t2.t = new Thread(t2);
			t2.t.start();
		}
		else {
			ThreadThree1 t3 = new ThreadThree1(t1.num);
			t3.t = new Thread(t3);
			t3.t.start();
		}

	}

}

