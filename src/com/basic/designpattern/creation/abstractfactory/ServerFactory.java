package com.basic.designpattern.creation.abstractfactory;

public class ServerFactory implements ComputerAbstarctFactory{

	private String ram;
	private String cpu;
	
	
	public ServerFactory(String ram, String cpu) {
		super();
		this.ram = ram;
		this.cpu = cpu;
	}


	@Override
	public Computer createComputer() {
		
		return new Server(ram,cpu);
	}
	

}
