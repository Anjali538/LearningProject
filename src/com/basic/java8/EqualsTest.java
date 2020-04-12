package com.basic.java8;

import java.util.HashSet;
import java.util.Set;

public class EqualsTest {

	public static void main(String[] args) {
		Employee11 e1 = new Employee11();
		Employee11 e2 = new Employee11();
		
 
        e1.setId(100);
        e2.setId(100);
 
        System.out.println(e1.equals(e2));  //false
        
        
        Set<Employee11> employees = new HashSet<Employee11>();
        employees.add(e1);
        employees.add(e2);
         
        System.out.println(employees);
	}

}

 class Employee11
{
    private Integer id;
    private String firstname;
    private String lastName;
    private String department;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	  @Override
	  public int hashCode() {
		  final int PRIME = 31;
		  int result = 1;
		  Employee11 e = new Employee11();
		  result = PRIME * result + e.getId();
		  return result;
	  }
	  public boolean equals(Object o) {
		  
		  if(o==null) {
			 return false;
		  }
		  if(o==this) {
			  return true;
		  }
		  if(getClass()!=o.getClass()) {
			  return false;
		  }
		  Employee11 e = (Employee11)o;
		  return this.getId()==e.getId();
		
		  
		   
	   }
	
}
