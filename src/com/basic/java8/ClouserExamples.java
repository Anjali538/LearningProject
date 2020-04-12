package com.basic.java8;

/*
 * https://dzone.com/articles/java-8-lambas-limitations-closures
 * Java implements closures, but there are limitations 
 * when we compare them with other languages. On the other hand, these limitations can be considered negligible.
 * *
 */


public class ClouserExamples {

	public static void main(String[] args) {
		int answer = 42;
		Thread t = new Thread(
				
		  () -> System.out.println("The answer is: " + answer)
		);

	}

}
