package com.basic.designpattern.creation.abstractfactory;

public class PCFactory implements ComputerAbstarctFactory {
	
	private String ram;
	private String cpu;
	

	public PCFactory(String ram, String cpu) {
		super();
		this.ram = ram;
		this.cpu = cpu;
	}


	@Override
	public Computer createComputer() {
		
		return new PC(ram,cpu);
	}

}
