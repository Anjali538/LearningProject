package com.basic.java8;

public class CalChild implements Cal , Cal1{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public void message() {
		// TODO Auto-generated method stub
		Cal.super.message();
	}

	public void message1() {
		Cal1.super.message();
	}


}
