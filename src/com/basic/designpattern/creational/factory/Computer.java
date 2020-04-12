package com.basic.designpattern.creational.factory;
//https://www.journaldev.com/1392/factory-design-pattern-in-java

public abstract class Computer {
	
public abstract String getRAM();
public abstract String getHDD();
public abstract String getCPU();

@Override
public String toString() {
	return "Computer [getRAM()=" + getRAM() + ", getHDD()=" + getHDD() + ", getCPU()=" + getCPU() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
