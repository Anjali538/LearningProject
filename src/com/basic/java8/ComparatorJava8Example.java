package com.basic.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorJava8Example {

	public static void main(String[] args) {
		
		//Closure
		
		int ans = 20;
		Thread t = new Thread(()->System.out.println(ans));
		
		//Sort By first name
		
		
		
		 List<Employee> employees  = getEmployees();
		 //Old Method
		 
		 Collections.sort(employees, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getAge()>o2.getAge() ? -1 : o1.getAge()<o2.getAge()? 1 : 0 ;
			}
			 
		 });
		 
		// System.out.println("Employee List By Age = " + employees);
		 
		 // Java 8 
		 employees.sort(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getAge()>o2.getAge() ? -1 : o1.getAge()<o2.getAge()? 1 : 0 ;
			}
			 
		 });
		 
		 System.out.println("Employee List By Age = " + employees);
		 
		 
		 // Java 8 lamda Expression
		// employees.sort(Comparator.comparing(e -> e.get));
		 
		 employees.sort((Employee o1 , Employee o2) -> {
			 return o1.getAge()>o2.getAge() ? -1 : o1.getAge()<o2.getAge()? 1 : 0 ;
		 });
		 
		
		 
	}
	private static List<Employee> getEmployees(){
	    List<Employee> employees  = new ArrayList<>();
	    employees.add(new Employee(6,"Yash", "Chopra", 25));
	    employees.add(new Employee(2,"Aman", "Sharma", 28));
	    employees.add(new Employee(3,"Aakash", "Yaadav", 52));
	    employees.add(new Employee(5,"David", "Kameron", 19));
	    employees.add(new Employee(4,"James", "Hedge", 72));
	    employees.add(new Employee(8,"Balaji", "Subbu", 88));
	    employees.add(new Employee(7,"Karan", "Johar", 59));
	    employees.add(new Employee(1,"Lokesh", "Gupta", 32));
	    employees.add(new Employee(9,"Vishu", "Bissi", 33));
	    employees.add(new Employee(10,"Lokesh", "Ramachandran", 60));
	    return employees;
	}

}

class Employee{
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	 
	public Employee(Integer id, String firstName, String lastName, Integer age){
	    this.id = id;
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.age = age;
	}
	 
	Employee e = new Employee(age, firstName, firstName, age);
	
	
	//Other getter and setter methods
	 
	@Override
	public String toString() {
	    return "\n["+this.id+","+this.firstName+","+this.lastName+","+this.age+"]"; 
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}	
}
