 /**
 * 
 */
package com.MultiThreading;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


class Process implements Runnable{
	private int twoTable = 2;
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started!!!");
		for(int i =0 ;i <5; i++) {
		System.out.println((i+1) + " * " + twoTable + " = " + (i+1)*twoTable);
		}
		System.out.println(Thread.currentThread().getName()+ " ended!!!");
	}
	
}
/**
 * @author HP
 *
 */
public class ExecutorServiceEx {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		 ExecutorService executorService =Executors.newSingleThreadExecutor();
		 executorService.execute(new Process());
		 executorService.execute(new Thread(new Process()));//new Thread is implicit we can give it also
		 executorService.execute(new Runnable() {
			 public void run() {
				 System.out.println(Thread.currentThread().getName() + " started!!!");
				 for(int i = 1 ; i<=5; i++) {
					 System.out.println((i+1) + " * " + 3 + " = " + (i+1)*3);
				 }
				 System.out.println(Thread.currentThread().getName() + " ended!!!");
		 }
		 });
		 ExecutorService executorService1 =Executors.newFixedThreadPool(2);
		 executorService1.execute(new Runnable() {
			 public void run() {
				 System.out.println(Thread.currentThread().getName() + " started!!!");
				 for(int i = 1 ; i<=5; i++) {
					 System.out.println((i+1) + " * " + 3 + " = " + (i+1)*3);
				 }
				 System.out.println(Thread.currentThread().getName() + " ended!!!");
			 }
		 });
		 executorService1.execute(new Runnable() {
			 public void run() {
				 System.out.println(Thread.currentThread().getName() + " started!!!");
				 for(int i = 1 ; i<=5; i++) {
					 System.out.println((i+1) + " * " + 3 + " = " + (i+1)*3);
				 }
				 System.out.println(Thread.currentThread().getName() + " ended!!!");
			 }
		 });
		 executorService1.execute(new Runnable() {
			 public void run() {
				 System.out.println(Thread.currentThread().getName() + " started!!!");
				 for(int i = 1 ; i<=5; i++) {
					 System.out.println((i+1) + " * " + 3 + " = " + (i+1)*3);
				 }
				 System.out.println(Thread.currentThread().getName() + " ended!!!");
				 
			 }
		 });
		 executorService.shutdown();
		 executorService1.shutdown();
	}

}
