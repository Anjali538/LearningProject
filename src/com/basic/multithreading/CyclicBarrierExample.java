package com.basic.multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

//https://www.java67.com/2015/06/how-to-use-cyclicbarrier-in-java.html

public class CyclicBarrierExample {

	public static void main(String[] args) {
		
		CyclicBarrier barrier =  new CyclicBarrier(4);
		Party p1 = new Party(barrier,1000,"Party 1");
		Party p2 = new Party(barrier,2000,"Party 2");;
		Party p3 = new Party(barrier,3000,"Party 3");;
		Party p4 = new Party(barrier,4000,"Party 4");;
		p1.start();
		p2.start();
		p3.start();
		p4.start();
	}

}
class Party extends Thread{
	private CyclicBarrier cyclicBarrier;
	private int delay;
	private String name;
	public Party(CyclicBarrier cyclicBarrier, int delay, String name) {
		super();
		this.cyclicBarrier = cyclicBarrier;
		this.delay = delay;
		this.name = name;
	}

	@Override
	public void run() {
		
		try {
			Thread.sleep(delay);
			System.out.println(Thread.currentThread().getName() + " Calling the await()");
			cyclicBarrier.await();
			System.out.println(Thread.currentThread().getName() + " has Started Running Again");
			
		} catch (InterruptedException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
