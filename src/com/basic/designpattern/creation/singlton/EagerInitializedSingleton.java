package com.basic.designpattern.creation.singlton;

/*
 * In eager initialization, the instance of Singleton Class is created at the time of class loading,
 * this is the easiest method to create a 
 * singleton class but it has a drawback that instance is created even though client application might not be using it.
 * Not providing exception handling
 * */
 
public class EagerInitializedSingleton {
	private static  final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {}
	
	public static EagerInitializedSingleton getInstance() {
		return instance;
		
	}

}
