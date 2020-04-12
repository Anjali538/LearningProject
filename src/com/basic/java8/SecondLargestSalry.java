package com.basic.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestSalry {

	public static void main(String[] args) {

		//Find first and find any
		List<Labour> empList = new ArrayList<>();
        empList.add(new Labour("Nataraja G", "Accounts", 15000));
        empList.add(new Labour("Nagesh Y", "Admin", 15000));
        empList.add(new Labour("Vasu V", "Security", 15000));
        empList.add(new Labour("Amar", "Admin", 2500));	

        List<Labour>  manObj = empList.stream().sorted(Comparator.comparing(Labour::getSalary)).collect(Collectors.toList());
        
        int length = manObj.size();
        int index = SecondLargestSalry.isSecondlargest(manObj, length-2, length-1);
        if(index == -1) {
      	  System.out.println("second largest number not present");
        } else {
      	  System.out.println(" Sorted Man obj == "+manObj.get(index)); 
        }
	}
	 public static int isSecondlargest(List<Labour> manObj,int a, int b) {
		 int Asal = manObj.get(b).getSalary();
		 int Bsal = manObj.get(a).getSalary();
		 int index = -1;
		 if(Asal == Bsal) {
			 System.out.println("Value Of a = " + a);
			 System.out.println("Value Of b = " + b);
			 
			 if(a<b && a>0) {
				 return SecondLargestSalry.isSecondlargest(manObj,a-1, b-1);
			 }
			 
	     } else {
	    	 index = a;
	     }
		 
		 return index;
	}

}
class Labour {
	 
    private String name;
    private String account;
    private Integer salary;
 
    public Labour(String name, String account, Integer salary) {
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
