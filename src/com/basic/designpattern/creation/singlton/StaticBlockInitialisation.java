package com.basic.designpattern.creation.singlton;


/*
 * Static block initialization implementation is similar to eager initialization,
 * except that instance of class is created in the static block that provides option for exception handling.
 */
public class StaticBlockInitialisation {
	
	private static StaticBlockInitialisation instance;
	private StaticBlockInitialisation(){}
	
	static {
		try {
			instance = new StaticBlockInitialisation();
		}catch(Exception e){
			throw new RuntimeException("Exception occured in creating singleton class");
			
		}
	}
	
	public static StaticBlockInitialisation getInstance() {
		return instance;
	}

}
