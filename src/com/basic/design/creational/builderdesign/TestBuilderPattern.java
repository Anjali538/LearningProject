package com.basic.design.creational.builderdesign;

public class TestBuilderPattern {

	public static void main(String[] args) {
		//One way direct call from the client class
		Computer comp = new Computer.ComputerBuilder("2 GB", "600 GB").builder();
		Computer comp1 = new Computer.ComputerBuilder("2 GB", "600 GB").setBluetoothEnabled(true).builder();
		
		//Call using the Builder Director class
		Computer cmp = ComputerBuilderDirector.getBasicComputer();
		Computer cmp2 = ComputerBuilderDirector.getGraphicsComputer();
		
		

	}

}
