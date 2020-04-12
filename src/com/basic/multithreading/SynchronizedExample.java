package com.basic.multithreading;


//https://www.java67.com/2016/05/how-to-use-multiple-threads-in-java.html
	
public class SynchronizedExample {
	public static Object Lock1 = new Object();
	public static Object Lock2 = new Object();
	
	public static void main(String[] args) {
		ThreaDemo1 t1  = new ThreaDemo1();
		t1.start();
	}
	
public synchronized void lockedByThis() {
	System.out.println(" This synchronized method is locked by current instance of object i.e. this");		
}
public static synchronized void lockedByClassLock() {
	   System.out.println("This static synchronized method is locked by class level lock of this class i.e. SychronizationExample.class");
}
public void lockedBySynchronizedBlock(){
    System.err.println("This line is executed without locking");
 
    Object obj = String.class; //class level lock of Stirng class
 
    synchronized(obj){
        System.out.println("synchronized block, locked by lock represented using obj variable");
    }
}
}

class ThreaDemo1 extends Thread{
	public static Object Lock1 = new Object();
	public void run() {
		synchronized(Lock1) {
			System.out.println(Thread.currentThread().getName()+"Current Thread Name");
		}
	}
	
}




	


