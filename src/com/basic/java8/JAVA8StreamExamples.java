package com.basic.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//https://www.java67.com/2014/04/java-8-stream-examples-and-tutorial.html
//https://www.java67.com/2018/06/java-8-streamcollect-example.html

//https://www.java2novice.com/java-8/streams/filter-method-example/
public class JAVA8StreamExamples {

	public static void main(String[] args) {
		 //Count Empty String
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		Long count = strList.stream().filter(a->a.isEmpty()).count();
//		System.out.println(count);
		// Count String with length more than 3

		Stream<String> lenCount = strList.stream().filter(a->a.length()>3);
//		System.out.println(lenCount);
		     
		//Count number of String which startswith "a"
	
		Long countStr = strList.stream().filter(a->a.startsWith("a")).count();
//		System.out.println(countStr);
		
		 
		
		//Find first and find any
		List<Man> empList = new ArrayList<>();
        empList.add(new Man("Nataraja G", "Accounts", 8000));
        empList.add(new Man("Nagesh Y", "Admin", 15000));
        empList.add(new Man("Vasu V", "Security", 2500));
        empList.add(new Man("Amar", "Admin", 15000));
        empList.stream().filter(e->e.getAccount().matches("Admin")).findFirst().ifPresent(System.out::println);
        
        empList.stream().filter(e->e.getAccount().matches("Admin")).findAny().ifPresent(System.out::println);
       //Stream.flatMap() is used to convert a Stream of Stream into a list of values.
        
      //Given list of Employee’s salaries. Using java 8 find out 2 maximum salaries.
        
       empList.stream().mapToInt(e->e.getSalary()).max().ifPresent(System.out::println);
       OptionalInt maxSal =  empList.stream().mapToInt(e->e.getSalary()).max();
       
      // Find Min or Max Number
       
       Integer maxNum = Stream.of(1,3,4,5).max(Comparator.comparing(Integer::valueOf)).get();
//       System.out.println(maxNum);
       
       //Get Min Max Object
       
       Man m = empList.stream().max(Comparator.comparing(Man::getAccount)).get();
//       System.out.println(m);
       
    
       
      List<Man>  manObj = empList.stream().sorted(Comparator.comparing(Man::getSalary)).collect(Collectors.toList());
     
      int length = manObj.size();
      int index = JAVA8StreamExamples.isSecondlargest(manObj, length-2, length-1);
      if(index == -1) {
    	  System.out.println("second largest number not present");
      } else {
    	  System.out.println(" Sorted Man obj == "+manObj.get(index)); 
      }
       
//      if(manObj.get(manObj.size()-1).getSalary()==manObj.get(manObj.size()-2).getSalary()) {
//    	  
//      }else {
//    	System.out.println(" Sorted Man obj == "+manObj.get(manObj.size()-2));  
//      }
      
      empList.forEach(item->{
    	   int largest= Integer.MIN_VALUE ;
		   int secondLargest=Integer.MIN_VALUE;
    	   if(item.getSalary()>largest) {
    		   secondLargest = largest;
    		   largest = item.getSalary();
    		   
    	   }
    	   else if (item.getSalary()>secondLargest&&item.getSalary()!=largest) {
    		   secondLargest = item.getSalary();
    	   }
    	   
       });
       
       
     
       
	}
 public static int isSecondlargest(List<Man> manObj,int a, int b) {
	 System.out.println("a" + a);
	 System.out.println("b" + b);
	 System.out.println("b slary" + manObj.get(b).getSalary());
	 System.out.println("a slary" + manObj.get(a).getSalary());
	 if(manObj.get(b).getSalary() == manObj.get(a).getSalary()) {
		 System.out.println("enter");
		 if(a<b && a>=0) {
			JAVA8StreamExamples.isSecondlargest(manObj,a-1, b-1);
		 } else {
			 return -1;
		 }
		 
     }else {
    	 System.out.println("enter 2");
    	 return a; // second largest index
     }
	 
	 return -1;
}
}

class Man {
	 
    private String name;
    private String account;
    private Integer salary;
 
    public Man(String name, String account, Integer salary) {
        super();
        this.name = name;
        this.account = account;
        this.salary = salary;
    }
 
    @Override
    public String toString() {
 
        return "name: "+ this.name +" | account: "+ this.account +" | salary: "+this.salary;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getAccount() {
        return account;
    }
 
    public void setAccount(String account) {
        this.account = account;
    }
 
    public Integer getSalary() {
        return salary;
    }
 
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}

