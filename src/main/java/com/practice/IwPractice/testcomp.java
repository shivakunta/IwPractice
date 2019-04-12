package com.practice.IwPractice;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class testcomp {
	
	public void removeElement(int[] a, int[] b, int ind) {
		int j = 0;
		for(int i=0;i < a.length; i++) {
			
			if(i == ind)
				continue;
			b[j++] = a[i];
		}
		
		for(int i: b) {
			System.out.println(i);
		}
		

	}

	public static void main(String[] args) {
			
	int[] arr = {1, 2, 3, 4, 5};
	int[] output = new int[arr.length-1];
	for(int i: arr) {
		System.out.println(i);
	}
	
	new testcomp().removeElement(arr, output, 1);
	}
	
	

}
