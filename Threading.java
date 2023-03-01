/**
 * 
 */
package com.MultiThreading;
//concurrency
class Print extends Thread{
//	Print(String s){
//		super(s);
//	}
	public void run() {
		System.out.println(Thread.activeCount());
		System.out.println(isAlive());
		System.out.println("thread Executing !!! " + getName());
	}
}
class Print1 extends Thread{
	public void run() {

		System.out.println(Thread.activeCount());
		for(int i = 0;i < 5; i++) {
		System.out.println(isAlive());
		if(i ==2) {
			stop();
		}
		System.out.println("thread 1 Executing !!! "+ getName());
		}
	}
}
class Print2 extends Thread{
	public void run() {
		//return no of threads currently running
		System.out.println(Thread.activeCount());
		for(int i = 0;i < 5; i++) {
		System.out.println(isAlive());
		System.out.println("thread 2 Executing !!! " + getName());
		if(i==2) {
			resume();
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
/**
 * @author HP
 *
 */
public class Threading  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Print(/* "thread 1" */).start();
		new Print1().start();
		new Print2().start();
		//new Print().isAlive();

	}

}
