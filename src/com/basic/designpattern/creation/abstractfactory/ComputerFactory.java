package com.basic.designpattern.creation.abstractfactory;

public class ComputerFactory {
	public static Computer  getComputer(ComputerAbstarctFactory factory) {
		return factory.createComputer();
	}

}
