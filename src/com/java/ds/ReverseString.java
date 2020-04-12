package com.java.ds;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Geeks for Geeks";
		reverse(str);
		reverseUsingLoop(str);
		reverseUisngStringBuilder(str);
	}

	private static void reverseUisngStringBuilder(String str) {
		StringBuilder in = new StringBuilder(str);
		in = in.reverse();
		System.out.println("Uisng Reverse == "+in);
		
	}

	

	private static void reverseUsingLoop(String str) {
		
		
		//using array Approch
		char[] in = str.toCharArray();
		char[] out = new char[in.length];
		System.out.println(Arrays.toString(in));
		int len = str.length();
		int j = 0;
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(in[i]); // one way to print
			out[j] = in[i];
			j++;

		}

		System.out.println(Arrays.toString(out));
		String s = new String(out);
		System.out.println("uisng arary: " + s);
		
		
		

	}

	public static void reverse(String str) {
		if (str == null || str.length() < 1) {
			System.out.println("String not found");
		} else if (str.length() == 1) {
			System.out.println(str);
		} else {
			System.out.print(str.charAt(str.length() - 1));
			reverse(str.substring(0, str.length() - 1));
		}
	}

}
