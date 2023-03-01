
/*/**
 * 
 */
package com.MultiThreading;

import java.util.Random;

class ThreadOne implements Runnable{
	Random r = new Random();
	int num ;
	Thread t;
	@Override
	public void run() {
		System.out.println("num is "+ (num = r.nextInt(10)));
		if(num %2 == 0) {
			ThreadTwo t2 = new ThreadTwo(num);
			t2.t = new Thread(t2);
			t2.t.start();
		}
		else {
			ThreadThree t3 = new ThreadThree(num);
			t3.t = new Thread(t3);
			t3.t.start();
		}
	}
	
}
class ThreadTwo implements Runnable{
	public int num1;
	ThreadTwo(int num){
		this.num1 = num;
	}
	Thread t;
	@Override
	public void run() {
		
		System.out.println(num1*num1);
	}
	
}
class ThreadThree implements Runnable{
	public int num2;
	ThreadThree(int num){
		this.num2 = num;
	}
	Thread t;
	@Override
	public void run() {
		
		System.out.println(num2*num2*num2);
	}
	
}
/**
 * @author HP
 *
 */
public class ThreeThreads {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ThreadOne t1 = new ThreadOne();
		t1.t = new Thread(t1);
		t1.t.start();
		//
		//System.out.println(t1.num);
		
	}

}
