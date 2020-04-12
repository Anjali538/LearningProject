package com.oops.code.practice;

public class RunTimePolyTest {

	public static void main(String[] args) throws Exception {
		A a = new B();
		A a1 = new C();
		a.m1();
		System.out.println(a.a);
		a1.m1();
		a.m2();
		A a2 = new A();
		a2.m1();
		B b = new B();
		b.m1();

	}

}
class A 
{ 
	int a = 90;
    void m1() throws  Exception
    { 
        System.out.println("Inside A's m1 method"); 
    } 
    void m2() {
    	System.out.println("Inside A not overridden");
    }
} 
  
class B extends A 
{ 
	int a = 100;
    // overriding m1() 
    void m1()  throws Exception
    { 
        System.out.println("Inside B's m1 method"); 
    } 
} 
  
class C extends A 
{ 
    // overriding m1() 
    void m1() 
    { 
        System.out.println("Inside C's m1 method"); 
    } 
} 
