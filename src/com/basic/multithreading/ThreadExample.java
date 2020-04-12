package com.basic.multithreading;

public class ThreadExample {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				 for(int i =0; i<2; i++){
	                    System.out.println("This is thread : " + Thread.currentThread().getName());
	                }		
			}
			
		},"Thread A");
		
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				 for(int i =0; i<2; i++){
	                    System.out.println("This is thread : " + Thread.currentThread().getName());
	                }
				
			}
			
		},"Thread B");
    t1.start();
    t2.start();
	}

}
