package com.basic.designpattern.behaviour.observer;
//https://www.geeksforgeeks.org/observer-pattern-set-1-introduction/
//https://www.geeksforgeeks.org/observer-pattern-set-2-implementation/
public class TestObserver {

	 public static void main(String args[]) 
	    { 
	        // create objects for testing 
	        AverageScoreDisplay averageScoreDisplay = 
	                          new AverageScoreDisplay(); 
	        CurrentScoreDisplay currentScoreDisplay = 
	                          new CurrentScoreDisplay(); 
	  
	        // pass the displays to Cricket data 
	        CricketData cricketData = new CricketData(); 
	  
	        // register display elements 
	        cricketData.registerObserver(averageScoreDisplay); 
	        cricketData.registerObserver(currentScoreDisplay); 
	  
	        // in real app you would have some logic to 
	        // call this function when data changes 
	        cricketData.dataChanged(); 
	  
	        //remove an observer 
	        cricketData.unregisterObserver(averageScoreDisplay); 
	  
	        // now only currentScoreDisplay gets the 
	        // notification 
	        cricketData.dataChanged(); 
	    } 
}
