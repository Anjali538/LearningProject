package com.basic.multithreading;

public class BasicExamples {
	// https://www.java67.com/search/label/Java%20Multithreading%20Tutorial?&max-results=3
	// https://www.java67.com/2019/06/right-way-to-create-start-and-stop-new-thread-java-example-tutorial.html#more

	// Daemon thread and user thread

	public static void main(String[] args) {
		ParallelTask lParallelTask = new ParallelTask();
		ParallelTask1 lParallelTask1 = new ParallelTask1();
		Thread t1 = new Thread(lParallelTask);
		Thread t2 = new Thread(lParallelTask1);
		
		//old ways using annonymous  class
		Runnable runn = new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread name : " + Thread.currentThread().getName());	
				
			}
			
		};
		
		Thread t3 = new Thread(runn);
		t3.start();
		//Uisng java 8 --lamda expression
		Runnable runnn = ()-> System.out.println("Thraed Nmae = " + Thread.currentThread().getName());
		Thread t4 = new Thread(runnn);
		
		
	
		//when set it Daemon thread then if main thread will execute first then no t1 and t2 will execute it will dies.
	//	t1.setDaemon(true);
	//	t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
		
		System.out.println("Mian Thread is finished");
	}
}

class ParallelTask implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("Parralel Task = " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class ParallelTask1 implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("Parralel Task2 = " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class  ParallelTask3 implements Runnable{
	@Override
	public void run() {
	try {
		Thread.sleep(3000);
		System.out.println("Parralel Task2 = " + Thread.currentThread().getName());
	}catch(InterruptedException e){
		
	}
	}
}
