package com.basic.multithreading;

public class Test {
	
	public static void main(String[] args) {
		A t = new A();
		t.message();
		
		t.message1();
		t.message2();
		
		
		
	}
	
	

}



class Main{
	public  void message() {
		System.out.print("hello");
	}
	
	public  void message1() {
		System.out.print("Anjali");
	}
}
class A extends Main{
	public  void message() {
		System.out.print("hi");
	}
	
	public  void message2() {
		System.out.print("Singh");
	}
	
	public  void message1() {
		System.out.print("Hee");
	}
}