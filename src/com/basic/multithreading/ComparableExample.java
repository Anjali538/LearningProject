package com.basic.multithreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		Person p4 = new Person(90, "Anjali");
		Person p1 = new Person(8, "pnjli");
		Person p2 = new Person(4, "Dnkur");
		Person p3 = new Person(89, "Bnkita");
		List<Person> strList = new ArrayList<Person>();
		strList.add(p1);
		strList.add(p2);
		strList.add(p3);
		strList.add(p4);
		Collections.sort(strList);
		System.out.println(strList);
		//Using lamda by Name
		
		
		strList.sort((o1, o2)->o1.getName().compareTo(o2.getName()));	
		System.out.println(strList);

	}

}

class Person implements Comparable<Person> {
	private int Id;
	private String name;

	public Person(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		
		// int res = this.Id > o.Id ? -1: this.Id == o.Id ? 0 : 1; // Customized implementation for descending order
		
		// int res = this.Id > o.Id ? 1: this.Id == o.Id ? 0 : -1; // Customized implementation for ascending order
		

		// int res1 = this.name.compareTo(o.name) ; //Natural ascending order based on name
		

		int res2 = o.name.compareTo(this.name); // Descending order by name
		// return res;
		// return res1;
		return res2;
	}

	@Override
	public String toString() {
		return "Person [Id= " + Id + ", name=" + name + "]";
	}

}


