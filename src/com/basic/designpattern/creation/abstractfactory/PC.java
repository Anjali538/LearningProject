package com.basic.designpattern.creation.abstractfactory;

public class PC extends Computer {

	
	private String ram;
	private String cpu;
	
	
	public PC(String ram, String cpu) {
		super();
		this.ram = ram;
		this.cpu = cpu;
	}

	public String getRAM() {
		
		return this.ram;
	}

	public String getCPU() {
		
		return this.cpu;
	}

}
