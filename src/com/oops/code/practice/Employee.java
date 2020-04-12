package com.oops.code.practice;

public interface Employee {
	public static final int name= 90;
	public void message();
	public void message1();
	 default void testMe() {
		System.out.println("calling default");
	}
public static void print() {
	System.out.print("Test staic");
}


}
