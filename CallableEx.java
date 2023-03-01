/**
 * 
 */
package com.MultiThreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Call implements Callable<Object>{

	@Override
	public Call call() throws Exception {
		System.out.println(Thread.currentThread().getName());
		return this;
	}
	public void call1()  {
		System.out.println(Thread.currentThread().getName());
		
	}
}
/**
 * @author HP
 *
 */
public class CallableEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Call c =  new Call();
//		try {
//			Call c1 = (Call) c.call();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<Object> future = executorService.submit(new Call());
		try {
			Call c = (Call) future.get();
			c.call1();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		executorService.shutdown();
	}

}
