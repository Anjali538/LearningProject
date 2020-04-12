package com.basic.design.creational.builderdesign;

public class ComputerBuilderDirector {
	
	public static Computer getBasicComputer() {
		return new Computer.ComputerBuilder("1GB", "4GB").builder();
	}
	
	public static Computer getGraphicsComputer() {
		return new Computer.ComputerBuilder("1GB", "4GB").setGraphicsCardEnabled(true).builder();
	}

}
