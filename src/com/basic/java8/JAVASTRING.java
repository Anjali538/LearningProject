package com.basic.java8;

import java.util.Arrays;

public class JAVASTRING {

	public static void main(String[] args) {
		String res = String.join("/", "C", "Ankur");
		String a = String.join(",", "Aloo", "Pyaj");
		System.out.println(res);
		System.out.println(a);
		String[] str = res.split("/");
		System.out.println(Arrays.toString(str));
		
		String in ="Anjali";
		String inn ="Anjali";
		String inpt = new String("Anjali");
		String inputt = new String("Anjali");
		System.out.println(inpt.compareTo(in));
		System.out.println(inpt.equals(in));
		System.out.println(inpt==inputt);
		System.out.println(in==inn);
	}

}
