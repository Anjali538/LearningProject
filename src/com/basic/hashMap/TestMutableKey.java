package com.basic.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class TestMutableKey {

	public static void main(String[] args)
    {
        //Create a HashMap with mutable key
        HashMap<Account, String> map = new HashMap<Account, String>();
        Iterator<Account> intr = map.keySet().iterator();
        ConcurrentHashMap map1 = new ConcurrentHashMap(); 
        TreeMap map3 = new TreeMap();
          
        //Create key 1
        Account a1 = new Account(1);
        a1.setHolderName("A_ONE");
        //Create key 2
        Account a2 = new Account(2);
        a2.setHolderName("A_TWO");
        
        System.out.println("HashCode of a1 = "+a1.hashCode());
        System.out.println("HashCode of a2 = "+a2.hashCode());
        
        System.out.println("euals of a1 and a2 = "+a1.equals(a2));
        
          
        //Put mutable key and value in map
        map.put(a1, a1.getHolderName());
        map.put(a2, a2.getHolderName());
          
        //Change the keys state so hash map should be calculated again
        a1.setHolderName("Defaulter");
        a2.setHolderName("Bankrupt");
        
        
        System.out.println("Again HashCode of a1 = "+a1.hashCode());
        System.out.println("Again HashCode of a2 = "+a2.hashCode());
          
        //Success !! We are able to get back the values
        System.out.println("Value of a1 = "+map.get(a1)); //Prints A_ONE
        System.out.println("Value of a2 = "+map.get(a2)); //Prints A_TWO
          
        //Try with newly created key with same account number
        Account a3 = new Account(1);
        
        a3.setHolderName("A_THREE");
        System.out.println("Again HashCode of a3 = "+a3.hashCode());
        System.out.println("euals of a1 and a2 = "+a1.equals(a3));
        map.put(a3, a3.getHolderName());
        
        //Success !! We are still able to get back the value for account number 1
        System.out.println(map.get(a3)); //Prints A_ONE
    }

}
