package com.basic.multithreading;


//https://javarevisited.blogspot.com/2010/10/difference-between-hashmap-and.html
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableExample {

	public static void main(String[] args) {
		Hashtable companies = new Hashtable();
		companies.put("Google", "United States");
		companies.put("Nokia", "Finland");
		companies.put("Sony", "Japan");
		
		System.out.println(companies.get("Google"));
		
		System.out.println(companies.containsKey("Google"));
		
		System.out.println(companies.containsValue("Japan"));
		
		Enumeration en = companies.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
    Set key = companies.keySet();
    Collection value = companies.values();
    Enumeration keyEn = companies.keys();
    Enumeration valEn = companies.elements();
    
    System.out.println("Key Enumeration = "+keyEn.nextElement());
    
    System.out.println("value Enumeration = "+valEn.nextElement());
    
    
	}

}
