package com.basic.design.creational.builderdesign;

//https://www.journaldev.com/1425/builder-design-pattern-in-java
//https://www.youtube.com/watch?v=D5NK5qMM14g
public class Computer {
	
	//Required Field
	private String RAM;
	private String HDD;

	// optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	public Computer(ComputerBuilder computerBuilder) {
		this.HDD=computerBuilder.HDD;
		this.RAM=computerBuilder.RAM;
		this.isGraphicsCardEnabled=computerBuilder.isGraphicsCardEnabled;
		this.isBluetoothEnabled=computerBuilder.isBluetoothEnabled;
	}
	public String getRAM() {
		return RAM;
	}
	public String getHDD() {
		return HDD;
	}
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
			
	public static class ComputerBuilder{
		//Required Field
		private String RAM;
		private String HDD;

		// optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		public ComputerBuilder(String rAM, String hDD) {
			super();
			RAM = rAM;
			HDD = hDD;
		}
		public void setRAM(String rAM) {
			RAM = rAM;
		}
		public void setHDD(String hDD) {
			HDD = hDD;
		}
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		public Computer builder() {
			return new Computer(this);
		}
		
	}

}
