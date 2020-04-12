package com.basic.designpattern.creation.singlton;
//https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
public class BillPughSingleton {
	
	private BillPughSingleton() {}
	private static class SingletonHelper{
		private static final BillPughSingleton instance = new BillPughSingleton();
		
	}
	public static BillPughSingleton getInstance() {
		return SingletonHelper.instance;
	}

}
