package com.basic.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingMovieTesting {

	public static void main(String[] args) {
		
		int a = 90;
		int b = 10;
	
		List<Movies> movieList = new ArrayList<Movies>();
		movieList.add(new Movies(2,"2 jan"));
		movieList.add(new Movies(8,"1 jan"));
		movieList.add(new Movies(5,"8 jan"));
		movieList.add(new Movies(1,"3 jan"));
		//one way
		Collections.sort(movieList,new Comparator<Movies>() {
			public int compare(Movies m1, Movies m2) {
				return m1.getRating()>m2.getRating()?1:m1.getRating()<m2.getRating()?-1:0;
				
			}

		});
		
		Collections.sort(movieList,Comparator.comparing((Movies m)->m.getRating()));
		
		//One way to Comparing
		movieList.sort((Movies m1 , Movies m2)->{
			return m1.getRating()>m2.getRating()?1:m1.getRating()<m2.getRating()?-1:0;
		});
		System.out.println(movieList);
		
		movieList.sort((Movies m1 , Movies m2)->{
			return m1.getYearOfRelease().compareTo(m2.getYearOfRelease());
		});
		
		System.out.println(movieList);
		System.out.println("Sorting on the basis of the move Rating");
		Collections.sort(movieList,Comparator.comparing((Movies m) -> m.getRating()));
		movieList.stream().forEach(System.out::println);
		
		System.out.println("Sorting on the basis of the year of realese");
		Collections.sort(movieList,Comparator.comparing((Movies m) -> m.getYearOfRelease()));
		movieList.stream().forEach(System.out::println);
		
		
}
}
