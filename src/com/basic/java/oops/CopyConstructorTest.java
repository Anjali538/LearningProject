package com.basic.java.oops;

public class CopyConstructorTest {

	public static void main(String[] args) {
		Rectangle firstRect = new Rectangle(5,6);
        Rectangle secondRect= new Rectangle(firstRect);
        System.out.println("Area  of First Rectangle : "+ firstRect.area());
        System .out.println("Area of First Second Rectangle : "+ secondRect.area());

	}

}
