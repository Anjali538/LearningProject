package com.basic.java8;

import java.util.ArrayList;
import java.util.List;

public class StreamExamplesJava8 {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();

		 

        arrayList.add("E");

        arrayList.add("C");

        arrayList.add("A");

        arrayList.add("N");

        arrayList.add("G");



        for (String string : arrayList) {

               System.out.print(string + " "); // E C A N G

        }



        System.out.println("\nPrinting with stream");

        arrayList.stream().forEach(System.out::printf); // Same as above



        System.out.println("\nPrinting with parallel stream");

        arrayList.parallelStream().forEach(i -> {

               System.out.print(i + " "); // Same 

        });

	}

}
