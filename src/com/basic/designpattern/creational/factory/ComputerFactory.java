package com.basic.designpattern.creational.factory;



public class ComputerFactory {
	public enum ComputerType{
		PC, Server
	}
	public static Computer getComputer(ComputerType type, String ram, String hdd, String cpu) {
		
		
		switch(type) {
		case PC:
			return new PC(ram, hdd,  cpu);
		case Server:
			return new Server(ram,hdd,cpu);
		default:
			return new PC(ram, hdd,  cpu);
		}
		
		
	}

}
