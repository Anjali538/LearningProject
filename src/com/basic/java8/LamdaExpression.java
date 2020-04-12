package com.basic.java8;

public class LamdaExpression {
	
	private static int a = 10;
	static int sVar = 100; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="localvaiable";
		Cab cab = (p)->{
			int localvar =100;
			System.out.println(p+ " : Uber Booked and arriving Soon" );
			//System.out.println("Local variable : " + s);
			System.out.println("Instannce Variable: " + a);
			System.out.println("Static Variable: " + sVar);
			System.out.println("Local  Variable: " + localvar);
			return 10.4;
		};
		cab.bookCab("bookIt");
	//	double fare = cab.bookCab("Banglore");
	//	System.out.println(fare);
		

	}
	
	
	
	

}
@FunctionalInterface
interface Cab{
	double bookCab(String in);
}
