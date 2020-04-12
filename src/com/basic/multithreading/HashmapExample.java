package com.basic.multithreading;

import java.util.HashMap;

import java.util.Map.Entry;

//https://www.baeldung.com/java-atomic-variables
public class HashmapExample {
	public static void main(String[] args) {	
		
		String a = new String();
		Employee e1 = new Employee(null,1000);
		Employee e2 = new Employee(null, 1000);
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.equals(e2));
		HashMap<Employee,Integer> map1 = new HashMap<Employee,Integer>();
		
		map1.put(e1, 100);
		map1.put(e2, 200);
		//System.out.println(map1.get(e1));
		//System.out.print("Previous Value"+res);
    	for(Entry<Employee,Integer> entry: map1.entrySet()) {
    		System.out.println(" Key "+entry.getKey());
    		System.out.println(" Value " +entry.getValue());
    		
    	}
	}
}
class Employee{
	
	private String name;
	private int Salary;
	
	public Employee(String name, int salary) {
		super();
		this.name = name;
		Salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Salary;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Salary != other.Salary)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}	
	
}
