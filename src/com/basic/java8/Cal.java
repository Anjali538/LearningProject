package com.basic.java8;


@FunctionalInterface

public interface Cal {
	
	
	public abstract int add(int a, int b);
	
	
	default void message() {
		System.out.println("hello Anjali");
		
	}
	default void message1() {
		System.out.println("hello Ankur");
		
	}
	static void check() {
		System.out.println("check static");
	}
	static void check1() {
		System.out.println("check static");
	}
}


