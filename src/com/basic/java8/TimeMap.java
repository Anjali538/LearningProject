package com.basic.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeMap {

	 private Map<String,TreeMap<Integer,Integer>> M;

	 public TimeMap() {

	       M= new HashMap<String, TreeMap<Integer,Integer>>();

	}

	 //  to store stock name price , timestamp

	  public void set(String key,int price, int timestamp) {

	          if(!M.containsKey(key)) {

	                 M.put(key, new TreeMap<Integer, Integer>());



	          }



	          M.get(key).put(timestamp, price);

	           }



	  //  to get value based on timestamp using floorkey function of treemap





	  public int get(String key, int timestamp) {

	       if (!M.containsKey(key)) return 0;

	       TreeMap<Integer, Integer> tree = M.get(key);

	       // main working by below line

	       Integer t = tree.floorKey(timestamp);

	       return t != 0 ? tree.get(t) : 0;

	   }
	  
}