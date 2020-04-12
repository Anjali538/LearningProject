package com.basic.java8;

public class TestCal {

	public static void main(String[] args) {
		Cal.check();
		Cal c = new CalChild();
		
		int a = c.add(3, 6);
		System.out.println(a);

		c.message();
		c.message1();
		
		
		
		

	}

}
