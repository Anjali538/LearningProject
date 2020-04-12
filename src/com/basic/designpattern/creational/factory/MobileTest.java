package com.basic.designpattern.creational.factory;

public class MobileTest {

	public static void main(String[] args) {
		Mobile m = MobileFactory.getMobile("Blue");
		Mobile m1 = MobileFactory.getMobile("Black");
		m.colour();
		m1.colour();
		
		
	}

}
