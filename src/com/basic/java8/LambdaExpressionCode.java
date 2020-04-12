package com.basic.java8;

public class LambdaExpressionCode {

	public static void main(String[] args) {
		FunInt1 add = (a,b)	->a+b;
		FinInt2 messg = mes -> System.out.println("hello" + mes);
		messg.sayMessage("Anjali");
		LambdaExpressionCode lLambdaExpressionCode= new LambdaExpressionCode();
		int result = lLambdaExpressionCode.operate(2, 4, add);
		System.out.println(result);
		
		

	}
	interface FunInt1{
		int operation(int a, int b);
	}
	interface FinInt2{
		void sayMessage(String message);
	}
	private int operate(int a, int b,FunInt1 fobj ) {
		return fobj.operation(a, b);
	}

}

