package com.basic.java8;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortingMapExamples {

	public static void main(String[] args) {
		
		
		//
		HashMap<Integer,Integer> hm =  new HashMap<Integer,Integer>();
		hm.put(8, 98); 
        hm.put(9, 85); 
        hm.put(7, 91); 
        hm.put(5, 95); 
        hm.put(2, 79); 
        hm.put(1, 80); 
        //
        TreeMap<Integer,Integer> tm = new TreeMap<Integer,Integer>(hm);
        tm.forEach((k,v) -> System.out.println(k+"-----" + v));
       //Using Stream API
        
    	Map sortedByvalue =hm.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1, e2) -> e1, LinkedHashMap::new));
    	sortedByvalue.forEach((k,v) -> System.out.println("KeyUsingStream = " + k + "ValueUsingStream = " + v));
    	
    	Map sortedByKey = hm.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByKey()).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2, TreeMap::new));
    	sortedByKey.forEach((k,v) -> System.out.println("KeyUsingStream = " + k + "ValueUsingStream = " + v));

        
        TreeMap<Integer,Integer> entryRes = new TreeMap<Integer,Integer>(hm);
        System.out.println(entryRes.firstEntry());
        
        //Sorted Value
        
        Collection<Integer> val1 = hm.values();
        TreeSet<Integer> res1Tree = new TreeSet<Integer>(val1);
        res1Tree.forEach(r -> System.out.println("Sorted value = " + r));
        
        // Sorted key by hashSet
        
        Set<Integer> setKey = hm.keySet();
        
        
		
		TreeSet<Integer> resTree = new TreeSet<Integer>(setKey);
		resTree.forEach(r -> System.out.println("Sorted Key = " + r));
		
		
        
		Map<Integer,Integer> res = sortedByvalue(hm);
		res.forEach((k,v) -> System.out.println("Key = " + k + "Value = " + v));	
		
		
		Map<Integer, Integer> keyRes = sortedByKey(hm);
		keyRes.forEach((k,v) -> System.out.println("Key = " + k + "Value = " + v));
		
		
		
		Set<Map.Entry<Integer,Integer>> setMap = hm.entrySet();
		setMap.forEach(System.out::println);
		
		
		Set<Integer> setKey1 = hm.keySet();
		
		TreeSet<Integer> resTree1 = new TreeSet<Integer>(setKey);
		
		
		
		setKey.forEach(System.out::println);
		
		Collection<Integer> val = hm.values();
		val.forEach(System.out::println);
		
		
	}
	private static Map<Integer, Integer> sortedByKey(HashMap<Integer, Integer> hm) {
		List<Map.Entry<Integer,Integer>> list = new LinkedList<Map.Entry<Integer,Integer>>(hm.entrySet());
	
		list.sort((Map.Entry<Integer,Integer> m1 , Map.Entry<Integer,Integer> m2) -> {
			return m1.getKey()>m2.getKey() ? 1: m1.getKey()<m2.getKey() ? -1:0;
		});
		Map<Integer, Integer> resMap = new LinkedHashMap<Integer,Integer>();
		for(Map.Entry<Integer, Integer> entry : list) {
			resMap.put(entry.getKey(),entry.getValue());
		}
		
		return resMap;
	}
	private static Map<Integer, Integer> sortedByvalue(HashMap<Integer, Integer> hm) {
		List<Map.Entry<Integer,Integer>> list = new LinkedList<Map.Entry<Integer,Integer>>(hm.entrySet());
		list.sort((Map.Entry<Integer,Integer> m1 , Map.Entry<Integer,Integer> m2) -> {
			return m1.getValue()>m2.getValue() ? 1: m1.getValue()<m2.getValue() ? -1:0;
		});
		
		Map<Integer, Integer> resMap = new LinkedHashMap<Integer,Integer>();
		for(Map.Entry<Integer, Integer> entry : list) {
			resMap.put(entry.getKey(),entry.getValue());
		}
		
		return resMap;
	}
	
	private static Map<Integer, Integer> sortedByValue1(HashMap<Integer,Integer> hm){
		List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer,Integer>>(hm.entrySet());
		list.sort((Map.Entry<Integer,Integer> map1, Map.Entry<Integer, Integer> map2)->{
			return map1.getValue()>map2.getValue()?1:map1.getValue()<map2.getValue()?-1:0;
		});
		Map<Integer, Integer> resMap = new LinkedHashMap<Integer,Integer>();
		for(Map.Entry<Integer, Integer> map:list ) {
			resMap.put(map.getKey(), map.getValue());
		}
		return resMap;
	}
	
	
	

}
