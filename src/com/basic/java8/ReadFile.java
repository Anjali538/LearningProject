package com.basic.java8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
//https://www.journaldev.com/878/java-write-to-file
//https://www.geeksforgeeks.org/counting-number-lines-words-characters-paragraphs-text-file-using-java/
public class ReadFile {

	public static void main(String[] args) {
		
		//using java8
		
		 wordCount();
		 
		 
		 //Using java 7
		 ReadUisngJava7();
		
		
	}
	
	
	public static void wordCount() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:\\Users\\anjsingh2\\Desktop\\JAVA_Interview\\test.txt"))));
			// Initializing counters 
			String line;
	        int countWord = 0; 
	        int sentenceCount = 0; 
	        int characterCount = 0; 
	        int paragraphCount = 1; 
	        int whitespaceCount = 0; 
	        try {
	        	  while((line = reader.readLine()) != null) 
	              { 
	                  if(line.equals("")) 
	                  { 
	                      paragraphCount++; 
	                  } 
	                  if(!(line.equals(""))) 
	                  { 
	                        
	                      characterCount += line.length(); 
	                        
	                      // \\s+ is the space delimiter in java 
	                      String[] wordList = line.split("\\s+"); 
	                      System.out.println("Word lst Length "+wordList.length);
	                      countWord += wordList.length; 
	                      System.out.println("Count Word =  "+countWord);
	                      whitespaceCount += countWord -1; 
	                      System.out.println("whitespaceCount =  "+whitespaceCount);
	                      // [!?.:]+ is the sentence delimiter in java 
	                      String[] sentenceList = line.split("[!?.:]+"); 
	                        
	                      sentenceCount += sentenceList.length; 
	                  } 
	              } 
	                
	              System.out.println("Total word count = " + countWord); 
	              System.out.println("Total number of sentences = " + sentenceCount); 
	              System.out.println("Total number of characters = " + characterCount); 
	              System.out.println("Number of paragraphs = " + paragraphCount); 
	              System.out.println("Total number of whitespaces = " + whitespaceCount); 
	          
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public static void ReadUisngJava7() {
		Path filePath = Paths.get("C:\\Users\\anjsingh2\\Desktop\\JAVA_Interview\\test.txt");
		try(Stream<String> lines = Files.lines(filePath)){
			
			lines.forEach(System.out::println);
			//lines.filter(s-> s.contains("OOPS")).forEach(System.out::println);
		
			
		}
		
			catch (IOException e) 
			{
			    e.printStackTrace();
			}
		//UISNG JAVA8
		
		 //File file = new File("/Users/kumarankur/Desktop/JAVA_CATCHUP_TOPICS/Content.txt");

		//Get the file reference
		 Path path = Paths.get("C:\\Users\\anjsingh2\\Desktop\\JAVA_Interview\\test.txt");
		  
		 //Use try-with-resource to get auto-closeable writer instance
		 try (BufferedWriter writer = Files.newBufferedWriter(path)) 
		 {
		     writer.write("Hi This is Anjali"
		     		+ "I am the senior developer");
		 } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	//Again read from the file
	Path filePaths = Paths.get("C:\\Users\\anjsingh2\\Desktop\\JAVA_Interview\\test.txt");
	try(Stream<String> lines = Files.lines(filePaths)){
		
		lines.forEach(System.out::println);
		//lines.filter(s-> s.contains("OOPS")).forEach(System.out::println);
	
		
	}
	
		catch (IOException e) 
		{
		}

}

}
