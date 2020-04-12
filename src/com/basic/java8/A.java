package com.basic.java8;


public interface A {
	public abstract void message();
	default void display() {
		System.out.println("A is priniting in display");
	}
	public abstract void message1();

}
@FunctionalInterface
interface B {
	public abstract void message1();
	default void display() {
		System.out.println("B is priniting in display");
	}
}

class C implements A , B{

	@Override
	public void message1() {
		System.out.println("A");
		
		
	}

	@Override
	public void message() {
		System.out.println("B");
		
	}

	@Override
	public void display() {
		System.out.println("C is printing in display");
		
	A.super.display();
		B.super.display();
	}

	
	
}
