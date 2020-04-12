package com.basic.multithreading;

public class DemonThread extends Thread 
{ 
    public DemonThread(String name){ 
        super(name); 
    } 
  
    public void run() 
    {  
        // Checking whether the thread is Daemon or not 
        if(Thread.currentThread().isDaemon()) 
        {  
            System.out.println(getName() + " is Daemon thread");  
        }  
          
        else
        {  
            System.out.println(getName() + " is User thread");  
        }  
    }  
      
    public static void main(String[] args) 
    {  
      
    	DemonThread t1 = new DemonThread("t1"); 
    	DemonThread t2 = new DemonThread("t2"); 
    	DemonThread t3 = new DemonThread("t3"); 
    	 t2.start(); 
    	  
        // Setting user thread t1 to Daemon 
        t1.setDaemon(true); 
              
        // starting first 2 threads  
        t1.start();  
       
        // Setting user thread t3 to Daemon 
        t3.setDaemon(true);  
        t3.start();         
    }  
} 
