package com.basic.designpattern.creation.singlton;


//https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
//it is good for single thread but but it will defeat the rule of singleton when multiple thread can go in the if condition at the same time.
public class LazyInitializedSingleton {
	
	private static LazyInitializedSingleton instance;
	private LazyInitializedSingleton() {}
	public static  LazyInitializedSingleton getInstance() {
		if(instance==null) {
			return new LazyInitializedSingleton();
		}
		return instance;
	}

}
