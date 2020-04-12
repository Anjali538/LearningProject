package com.basic.multithreading;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapCollisionExample {

	public static void main(String[] args) {
		HashMap<MyKey, String> map = new HashMap<>();
	    MyKey k1 = new MyKey(1, "firstKey");
	    MyKey k2 = new MyKey(2, "secondKey");
	    MyKey k3 = new MyKey(2, "thirdKey");
	 
	    System.out.println("storing value for k1");
	    map.put(k1, "firstValue");
	    System.out.println("storing value for k2");
	    map.put(k2, "secondValue");
	    System.out.println("storing value for k3");
	    String val = map.put(k3, "thirdValue");
	    System.out.println("---------"+val);
	 
	    System.out.println("retrieving value for k1");
	    String v1 = map.get(k1);
	    System.out.println("retrieving value for k2");
	    String v2 = map.get(k2);
	    System.out.println("retrieving value for k3");
	    String v3 = map.get(k3);
	    
	    System.out.println(" First =  " +v1);
	    System.out.println(" Second = " +v2);
	    System.out.println(" Third = " +v3);
	    
	    HashMap<String, Integer> map1 = new HashMap<>();
	    map1.put("Anjali", 1);
	    map1.put("Ankur", 2);
	    map1.put("Ankit", 3);
	    System.out.println("Map Size() = "+map1.size());
	    for(Entry<String, Integer> entry: map1.entrySet()) {
	    	System.out.println("Key = "+entry.getKey());
	    	System.out.println("Value = "+entry.getValue());
	    }

	}

}

class MyKey {
    private String name;
    private int id;
 
    public MyKey(int id, String name) {
        this.id = id;
        this.name = name;
    }
     
    // standard getters and setters
  
    @Override
    public int hashCode() {
        System.out.println("Calling hashCode()");
        return id;
    } 
  
    // toString override for pretty logging
 
    @Override
    public boolean equals(Object obj) {
        System.out.println("Calling equals() for key: " + obj);
        // generated implementation
		return false;
    }
 
}
