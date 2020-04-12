package com.basic.java8;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		
		//Throw null point Exception
		String[] word = new String[10];
//	String word1 = word[5].toLowerCase();
//		System.out.println(word1);
		
		//Handling Null Pointer Exception
		Optional<String> checkNull = Optional.ofNullable(word[4]);
		if(checkNull.isPresent()) {
			String word2 = word[4].toLowerCase();
			System.out.println(word2);
		}else {
			System.out.println("word is null");
			
			//
			
			 word[2] = "Geeks Classes are coming soon";
			 Optional<String> empty = Optional.empty(); 
			 System.out.println(empty);
			 
			// It returns a non-empty Optional 
		        Optional<String> value = Optional.of(word[2]); 
		        System.out.println(value); 
		        
		        System.out.println(value.get()); 
		        
		        
		     // It returns hashCode of the value 
		        System.out.println(value.hashCode()); 
		        
		        
		        System.out.println(value.isPresent()); 
		       
		}

	}

}
