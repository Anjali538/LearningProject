package com.basic.designpattern.creational.factory;

public class Samsung implements Mobile {
	private String colour;

	public Samsung(String colour) {
		super();
		this.colour = colour;
	}
	@Override
	public void colour() {
		
		System.out.println("Samsung");
	}
	
}
