package com.basic.java.oops;

import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) throws IOException {
		
	int res = ExceptionTest.add();
	System.out.println(res);
		

	}
	
	public static int add() throws IOException {
		try {
//			throw new RuntimeException("Exception Occured while run time");
			throw new IOException("Exception Occured while run time");
			}finally {
				//System.out.println("abc");
				return 0;
			}
	}

}
