package com.basic.designpattern.creational.factory;

public class Iphone implements Mobile{
	
	private String colour;
	

	public Iphone(String colour) {
		super();
		this.colour = colour;
	}
	@Override
	public void colour() {
		
		System.out.println("Iphone");
	}

}
