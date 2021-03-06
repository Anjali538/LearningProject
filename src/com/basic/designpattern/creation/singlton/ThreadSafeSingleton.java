package com.basic.designpattern.creation.singlton;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	private ThreadSafeSingleton() {}
	public static synchronized  ThreadSafeSingleton getInstance() {
		if(instance==null) {
			return new ThreadSafeSingleton();
		}
		return instance;
	}
//Using Double Locking
public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
    if(instance == null){
        synchronized (ThreadSafeSingleton.class) {
            if(instance == null){
                instance = new ThreadSafeSingleton();
            }
        }
    }
    return instance;
}

}
