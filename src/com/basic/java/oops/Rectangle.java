package com.basic.java.oops;

public class Rectangle {

    int length;
    int breadth;
    //constructor to initialize length and bredth of rectang of rectangle
    Rectangle(int l, int b)
    { 
       length = l;
       breadth= b;
    }
    //copy constructor
    Rectangle(Rectangle obj)
    {
      System.out.println("Copy Constructor Invoked");
      length = obj.length;
      breadth= obj.breadth;
    }
   //method to calcuate area of rectangle
   int area()
   {
      return (length * breadth);
   }
}
   
