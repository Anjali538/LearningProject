package com.basic.multithreading;

import java.util.concurrent.CountDownLatch;

//https://www.java67.com/2015/06/java-countdownlatch-example.html
public class CountDownLatchExample {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch = new CountDownLatch(3);
		Worker w1 = new Worker(1000,latch,"Worker1");
		Worker w2 = new Worker(2000,latch,"Worker2");
		Worker w3 = new Worker(3000,latch,"Worker3");
		
		w1.start();
		w2.start();
		w3.start();
		
		latch.await();
		
		System.out.println(Thread.currentThread().getName() + " has finished");

	}
	
	

}

class Worker extends Thread{
	private int delay;
	private CountDownLatch latch;
	private String name;
	public Worker(int delay, CountDownLatch latch, String name) {
		super();
		this.delay = delay;
		this.latch = latch;
		this.name = name;
	}
	@Override
	public void run() {
		try {
            Thread.sleep(delay);
           
            System.out.println(Thread.currentThread().getName() + " has finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
       }
		 latch.countDown();
		System.out.println("Count No = " + latch.getCount());
		
	}
}
