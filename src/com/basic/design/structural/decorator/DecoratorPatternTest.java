package com.basic.design.structural.decorator;
//https://www.journaldev.com/1540/decorator-design-pattern-in-java-example
//https://www.geeksforgeeks.org/decorator-pattern/ --- impt
//https://www.geeksforgeeks.org/the-decorator-pattern-set-2-introduction-and-design/
public class DecoratorPatternTest {

	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();
		System.out.println("\n*****");
		
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
		sportsLuxuryCar.assemble();
	}

}
