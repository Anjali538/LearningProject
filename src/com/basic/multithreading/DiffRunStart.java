package com.basic.multithreading;
/**
 * Java Program to demonstrate the difference between run() vs start() method of
 * Thread class in Java. Just remember that when you directly call the run()
 * method, code written inside the run() method will be executed in the calling
 * thread, but when you call the start() method then a new thread will be
 * created to execute the code written inside run() method in Java.
 * 
 * @author Anjali
 *
 */
public class DiffRunStart {

	public static void main(String[] args) {
		Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()
                        + " is executed the run() method");
            }		
		};
	
		System.out.println( Thread.currentThread().getName() + " Calling the start() method of Thread");
		t.start();
		// let's wait until the thread completes execution
        try {
            t.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println( Thread.currentThread().getName() + " Calling the run() method of Thread");
        t.run();
		

	}

}
