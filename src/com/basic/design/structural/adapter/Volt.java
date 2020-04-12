package com.basic.design.structural.adapter;


//https://www.journaldev.com/1487/adapter-design-pattern-java
public class Volt {
private int volts;
	
	public Volt(int v){
		this.volts=v;
	}

	public int getVolts() {
		return volts;
	}

	public void setVolts(int volts) {
		this.volts = volts;
	}
}
