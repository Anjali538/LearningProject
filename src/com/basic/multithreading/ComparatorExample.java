package com.basic.multithreading;

import java.util.*;

public class ComparatorExample {

	public static void main(String[] args) {
		
		List<Employee1> empList = new ArrayList<Employee1>();
		empList.add(new Employee1(9,"surbhi"));
		empList.add(new Employee1(6,"ankita"));
		empList.add(new Employee1(1,"Jeck"));
		empList.add(new Employee1(2,"Bala"));
		
		//Collections.sort(empList,);
		
		SortById obj = new SortById();
		
		Collections.sort(empList, obj); //using other Class Implementation
		//Sorting by Id
//		Collections.sort(empList, new Comparator<Employee1>() {   //Using Anonymous Class implemention
//
//			@Override
//			public int compare(Employee1 o1, Employee1 o2) {
//				
//			return o1.getEmpId() > o2.getEmpId() ? 1 : o1.getEmpId() < o2.getEmpId() ? -1 : 0;
//			}
//			
//		});
		System.out.println("Employee List By Id = " + empList);
		
		//Using java8 new feature  long way
//		empList.sort(new Comparator<Employee1>() {
//
//			@Override
//			public int compare(Employee1 o1, Employee1 o2) {
//				// TODO Auto-generated method stub
//				return o1.getEmpId() > o2.getEmpId() ? 1 : o1.getEmpId() < o2.getEmpId() ? -1 : 0;
//			}
//			
//		});
		
		//Using Lambda Expression by java 8
		
		empList.sort((Employee1 o1, Employee1 o2) -> {
			return o1.getEmpId() > o2.getEmpId() ? 1 : o1.getEmpId() < o2.getEmpId() ? -1 : 0;
		});
		
		System.out.println("Employee List By Id = " + empList);
		
		empList.sort((Employee1 o1, Employee1 o2)->{
			return o1.getEmpIdName().compareTo(o2.getEmpIdName());
		});
		
		
		//Sorting BY Name
//		Collections.sort(empList, new Comparator<Employee1>() {
//
//			@Override
//			public int compare(Employee1 o1, Employee1 o2) {
//				
//			return o2.getEmpIdName().compareTo(o1.getEmpIdName());
//			}
//			
//		});
	
		
		System.out.println("Employee List By Nmae = " + empList);
	}


}

class SortById implements  Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		return o1.getEmpId() > o2.getEmpId() ? 1 : o1.getEmpId() < o2.getEmpId() ? -1 : 0;
	}
	
}  

class Employee1 {
	private int EmpId;
	private String EmpIdName;

	

	public Employee1(int empId, String empIdName) {
		super();
		EmpId = empId;
		EmpIdName = empIdName;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmpIdName() {
		return EmpIdName;
	}

	public void setEmpIdName(String empIdName) {
		EmpIdName = empIdName;
	}

	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpIdName=" + EmpIdName + "]";
	}

}
