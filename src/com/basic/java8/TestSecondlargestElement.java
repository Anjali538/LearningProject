package com.basic.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestSecondlargestElement {

	public static void main(String[] args) {
		List<Integer> salary = Arrays.asList(80,533,56,87,533);
		Collections.sort(salary);
		int[] element = new int[] {533,533,533,49,533};
		int secondElement = TestSecondlargestElement.findSecondlargest(element, element.length);
		if(secondElement==Integer.MIN_VALUE) {
			System.out.println(" No Second largest Element");	
		}
		else {
		System.out.println("Second largest Element = " + secondElement);
		
		}
	}
	
	public static int findSecondlargest(int[] arr, int n) {
		int f = Integer.MIN_VALUE;
		int s = Integer.MIN_VALUE;
		for(int i = 0; i<n;i++) {
			if(arr[i]>f) {
				s=f;
				f=arr[i];
			}
			else if(arr[i]>s && arr[i] != f) {
				s=arr[i];
			}
		}
		return s;
	}

}
