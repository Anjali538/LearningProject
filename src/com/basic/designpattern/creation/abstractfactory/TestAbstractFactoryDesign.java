package com.basic.designpattern.creation.abstractfactory;


//https://www.journaldev.com/1418/abstract-factory-design-pattern-in-java
//https://youtu.be/BPkYkyVWOaw


public class TestAbstractFactoryDesign {

	public static void main(String[] args) {
		Computer PC = ComputerFactory.getComputer(new PCFactory("2 Gb", "300 Gb"));
		Computer Server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB"));
		System.out.println(PC.getRAM());
		System.out.println(Server);

	}

}
