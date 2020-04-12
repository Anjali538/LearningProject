package com.basic.designpattern.creation.abstractfactory;

public abstract class Computer {
	
	
	
	
	


	public abstract String getRAM();
	public abstract String getCPU();
	@Override
	public String toString() {
		return "Computer [getRAM()=" + getRAM() + ", getCPU()=" + getCPU() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
