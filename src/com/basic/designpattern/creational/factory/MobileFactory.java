package com.basic.designpattern.creational.factory;

public class MobileFactory {
	
	public static Mobile getMobile(String colour) {
		if("Black".equalsIgnoreCase(colour)) {
			return new Iphone(colour);
		}
		if("Blue".equalsIgnoreCase(colour)) {
			return new Samsung(colour);
		}
		return null;
		
	}

}
