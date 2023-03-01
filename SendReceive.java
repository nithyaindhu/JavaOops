/**
 * 
 */
package com.MultiThreading;


class Data{
	private String message;
	
	public void send(String message) {
		this.message = message;
	}
	public String receive() {
		return message;
	}
}
class Sender implements Runnable{
	Data data;
	public Sender(Data data){
		this.data = data;
	}
	@Override
	public void run() {
		synchronized(data) {
			data.send("Hi there !!! how are you ?");
			try {
			data.notifyAll();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Receiver implements Runnable{
	Data data;
	public Receiver(Data data){
		this.data = data;
	}
	@Override
	public void run() {
		synchronized(data) {
		try {
			data.wait();
		} catch (InterruptedException e) {
			System.out.println(e);
			Thread.currentThread().interrupt();
		}
		System.out.println(data.receive());
		}
	}
}
/**
 * @author HP
 *
 */
public class SendReceive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Data data = new Data();
		Sender send = new Sender(data);
		Thread thread = new Thread(send);
		Receiver receive = new Receiver(data);
		Thread thread1 = new Thread(receive);
		thread1.start();
		thread.start();
		
		try {
			thread.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			thread1.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
