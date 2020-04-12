package com.basic.multithreading;

import java.util.concurrent.TimeUnit;

public class StopExample {

	public static void main(String[] args) {
		Server myServer  = new Server();
		Thread t1 = new Thread(myServer);
		t1.start();
		System.out.println(Thread.currentThread().getName() + " is stopping server thread");
		myServer.stop();
		 //Let's wait to see server thread stopped 
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println(Thread.currentThread().getName() + " is finished now");

	}

}

class Server implements Runnable{
    private volatile boolean exit = false;
    
    public void run() {
        while(!exit){
            System.out.println("Server is running.....");
        }
        
        System.out.println("Server is stopped....");
    }
    
    public void stop(){
        exit = true;
    }
}
