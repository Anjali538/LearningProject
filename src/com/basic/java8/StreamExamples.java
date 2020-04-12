package com.basic.java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.*;

//https://howtodoinjava.com/java8/java-streams-by-examples/

public class StreamExamples {

	public static void main(String[] args) {
		//I have a stream of strings and I want to collect them in  a map with key as length and value as a Set of those words
		  Stream<String> input = Stream.of("Anjali", "Ankur");
		  Map<Integer,String> res = input.collect(Collectors.toMap(String::length, e->e));
		  System.out.println("Set of String : " + res.entrySet());
		  
		  
		  //Count string having e character
		  List<String> In = Arrays.asList("Ken","Jeff", "Ellen", "Hllo");
		  int count = (int) In.stream().filter(a->a.contains("e")).count();
		  System.out.println("Count the number of e in List = " + count);
		  
		  //Write a program to count the number of e in a list. E.g "Ken", "Jeff", "Ellen" should print 4. - Code
		  
	
		
		
		List<Integer> num = Arrays.asList(1, 5, 8, 6, 7, 5);
		Integer sum = num.stream().filter(StreamExamples::isOdd).reduce(0, Integer::sum);
		System.out.println(sum);
		
		
		//Convert list into sorted Set
		TreeSet<Integer> sortedSet = num.stream().collect(Collectors.toCollection(TreeSet::new));
		
	//	TreeSet<Integer> sorted9Set = num.stream().collect(Collectors.toCollection(TreeSet::new));
		sortedSet.forEach(p ->System.out.println(" Sorted set == "+p));
		
		//Calculate average in an array list 
		IntStream stream = IntStream.of(1,2,3,4,5);
		OptionalDouble avg = stream.average();
		if(avg.isPresent()) {
		System.out.println(" Calculated Average"+avg);
		}
		//Another way to find the average
		Double avrg = num.stream().mapToDouble(n -> n).average().orElse(0.0);
		
		System.out.println("Way to find the average = ::: "+avrg);
		
	
		
		//Collectors in Stream
		
		List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
		String Res = letters.stream().collect(Collectors.joining(","));
		System.out.println("Joining the result : "+Res);
		

		Arrays.stream(new String[] { "Ram", "Anjali", "Anita" })
		.filter(s -> s.startsWith("An"))
		.map(String::toUpperCase).sorted();
		//.forEach(System.out::println);
		
		String a = null;
	

		num.stream().filter(n -> n % 2 != 0).forEach(System.out::println);
		//ways to create Stream

		Stream<Integer> st = Stream.of(1, 5, 7, 9, 8);
		st.forEach(p -> System.out.print(p));

		Stream<Integer> stream11 = Stream.of(new Integer[] { 3, 8, 9 });
		stream11.forEach(p -> System.out.println(p));
		// stream.forEach(System.out::println);

		List<Integer> list = Arrays.asList(1, 6, 9, 3, 7);
		Stream<Integer> strm = list.stream();
		//Convert Stream into Collections Stream.collect( Collectors.toList() )
		strm.filter(p -> p % 2 != 0).sorted().collect(Collectors.toList()).forEach(System.out::println);
		
		;

		Stream<Date> strmDate = Stream.generate(() -> {
			return new Date();
		});
		// strmDate.forEach(p -> System.out.println("Hello : "+p));

		IntStream stream1 = "1234_abc".chars();
		stream1.forEach(p -> System.out.println("**+++++++++++***" + p));

		Stream<String> stream123 = Stream.of("A$B$C".split("\\$"));
		stream123.forEach(p -> System.out.println(p));
		
		
		//Convert Stream into Arrays Stream.toArray( EntryType[]::new )
		
		//Integer[] abc = strm.filter(p -> p % 2 != 0).toArray(Integer[]:: new);
		
		//Core Stream operations
		
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		//Intermediate Operation
		//filter
		//map
		//sorted
		//distinct
		
		memberNames.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);
		
		memberNames.stream().filter(s -> s.startsWith("A")).map(String :: toUpperCase).forEach(System.out::println);
		
		//Terminal operation
		//collect
		//reduce
		//count
		//toArray
		//Match
		//forEach
		boolean res1 = memberNames.stream().anyMatch(s -> s.startsWith("A") );
		System.out.println(res1);
		
		long countCA = memberNames.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(countCA);
		
		
		//reduce
		
		Optional<String> reduced = memberNames.stream().reduce((s1,s2) -> s1 + "#" + s2);
		System.out.println(reduced);
		
		Integer sum1 = list.stream().reduce(0, Integer::sum);
		System.out.println(sum1);
		//Stream short-circuit operations
		//stream.anyMatch()
		//stream.findFirst()
		
		String name = memberNames.stream().filter(s -> s.startsWith("A")).findFirst().get();
		System.out.println("Name" + name);
		
		//Parallelism in Java Steam
		
		Integer[] evenNum = list.parallelStream().filter(i -> i%2 == 0).toArray(Integer[] :: new);
		System.out.println(evenNum.length);
		
		
		//FlatMap
		
		    List<Integer> list1 = Arrays.asList(1,2,3);
	        List<Integer> list2 = Arrays.asList(4,5,6);
	        List<Integer> list3 = Arrays.asList(7,8,9); 
	        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
	        List<Integer> rest = listOfLists.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		    System.out.print(rest);
		    
		    
		
	}

	public static boolean isOdd(int num) {
		return num % 2 != 0;
	}
	
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	

}
